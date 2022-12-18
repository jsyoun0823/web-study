public class TryCatchExample {
    public static void main(String[] args) {
        try {
            String st = null;
            System.out.println(st.toString());
        } catch (Exception e) {
            String err = null;
            System.out.println(err.toString());
        } finally {
            System.out.println("finally");
        }
    }
}