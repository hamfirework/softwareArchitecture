package pattern.project.cleaner;

public class CleanerFactory {

    public static Cleaner createCleaner(CType cType, String name) {
        try{
            Class<?> t = Class.forName("pattern.project.cleaner."+ cType.getClassName());
            Class[] cArg = new Class[1];
            cArg[0] = String.class;
            return (Cleaner) t.getDeclaredConstructor(cArg).newInstance(name);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

}
