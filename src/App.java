public class App {
    public static void main(String[] args) throws Exception {
        //Detta program inkluderar både B och C uppgiften
        int tal1= 10;
        int tal2= 20;
        if (tal2 > tal1)
        {
            System.out.println(tal2+" Är större än "+tal1);
        }
        else if (tal2 == tal1)
        {
            System.out.println(tal2+" Är lika stor som "+tal1);
        }
        else {
            System.out.println(tal2+" Är mindre än "+tal1);

        }

    }
}
