package Gadgets.Type;

/**
 * Created by Ficos on 16/3/30.
 */
public class AtomType extends Type {
//    Since every Atom type will be created only once, the comparing is useless.

    //    protected static int count = 0;
//    private final int uID;
//    AtomType(){
//        uID = ++count;
//    }
//    public Boolean Equals(AtomType rhs) {
//        return uID == rhs.uID;
//    }
//
//    public static void main(String[] args) {
//        AtomType a1 = new AtomType();
//        AtomType a2 = new AtomType();
//        AtomType a5 = a1;
//
//        AtomType a3 = new AtomType();
//        AtomType a4 = a3;
//        AtomType a6 = a4;
//        System.out.println(a3 == a6);
//    }
    @Override
    public Boolean equals(Type rhs) {
        return this == rhs;
    }
}
