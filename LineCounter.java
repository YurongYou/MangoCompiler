/**
 * Count the total line number of the project
 */

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineCounter {
    static long commentLine = 0;
    static long whiteLine = 0;
    static long normalLine = 0;
    static long totalLine = 0;
    static boolean comment = false;

    public static void main(String[] args) {
        File file = new File("/Users/youyurong/Dropbox/课程/Compiler/Mango/src/AST");
        countLine(file);
        file = new File("/Users/youyurong/Dropbox/课程/Compiler/Mango/src/ASTBuilder");
        countLine(file);
        file = new File("/Users/youyurong/Dropbox/课程/Compiler/Mango/src/ASTVisitor");
        countLine(file);
        file = new File("/Users/youyurong/Dropbox/课程/Compiler/Mango/src/Gadgets");
        countLine(file);
        file = new File("/Users/youyurong/Dropbox/课程/Compiler/Mango/src/Exceptions");
        countLine(file);
        file = new File("/Users/youyurong/Dropbox/课程/Compiler/Mango/src/Syntax/Mango.g4");
        countLine(file);
        System.out.println("有效代码行数: " + normalLine);
        System.out.println("注释行数: " + commentLine);
        System.out.println("空白行数: " + whiteLine);
        System.out.println("总行数: " + totalLine);
    }

    /**
     * 递归统计代码行数
     *
     * @param child
     */
    private static void countLine(File child) { // 遍历子目录
        if (child.getName().matches(".*\\.java$") || child.getName().matches(".*\\.g4")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(child));
                String line = "";
                while ((line = br.readLine()) != null) {
                    parse(line);
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (child.listFiles() != null) {
            for (File f : child.listFiles()) {
                countLine(f);
            }
        }
    }

    private static void parse(String line) {
        line = line.trim();
        totalLine++;
        if (line.length() == 0) {
            whiteLine++;
        } else if (comment) {
            commentLine++;
            if (line.endsWith("*/")) {
                comment = false;
            } else if (line.matches(".*\\*/.+")) {
                normalLine++;
                comment = false;
            }
        } else if (line.startsWith("//")) {
            commentLine++;
        } else if (line.matches(".+//.*")) {
            commentLine++;
            normalLine++;
        } else if (line.startsWith("/*") && line.matches(".+\\*/.+")) {
            commentLine++;
            normalLine++;
            if (isComment(line)) {
                comment = false;
            } else {
                comment = true;
            }
        } else if (line.startsWith("/*") && !line.endsWith("*/")) {
            commentLine++;
            comment = true;
        } else if (line.startsWith("/*") && line.endsWith("*/")) {
            commentLine++;
            comment = false;
        } else if (line.matches(".+/\\*.*") && !line.endsWith("*/")) {
            commentLine++;
            normalLine++;
            if (isComment(line)) {
                comment = false;
            } else {
                comment = true;
            }
        } else if (line.matches(".+/\\*.*") && line.endsWith("*/")) {
            commentLine++;
            normalLine++;
            comment = false;
        } else {
            normalLine++;
        }
    }

    private static boolean isComment(String line) { // 查找一行中/*与*/是否成对出现
        int count1 = 0;
        int count2 = 0;
        Pattern p = Pattern.compile("/\\*");
        Matcher m = p.matcher(line);
        while (m.find()) {
            count1++;
        }
        p = Pattern.compile("\\*/");
        m = p.matcher(line);
        while (m.find()) {
            count2++;
        }
        return (count1 == count2);
    }

}