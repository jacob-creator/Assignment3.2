public class Nice {

    public static void main(String[] args) {

        String[] names = new String [5];
        int [] ages = new int[5];
        String [] jobs = new String[5];

        //Lollero's info
        names[0] = "Lollero";
        ages[0] = 27;
        jobs[0] = "Dev or something";

        //Jake's info
        names[1] = "Jake";
        ages [1] = 21;
        jobs[1] = "Pixelmon Manager";

        //Susie's info
        names[2] = "Susie";
        ages[2] = 19;
        jobs[2] = "Intern";

        //Jamie's info
        names[3] = "Jamie";
        ages[3] = 22;

        //Nathan's info
        names[4] = "Nathan";
        ages[4] = 16;
        jobs[4] = "Student";

        int i = 0;

        for (String element : jobs ){
            if (jobs[i] == null){
                System.out.println(names[i] + "'s age is " + ages[i] + " and has no job.");
            }
            else {
                System.out.println(names[i] + "'s age is " + ages[i] + " and has a job of " + jobs[i]);
            }
            i++;
        }
    }
}