import java.util.*;

class Vote{



    static Queue<String> zohaib = new LinkedList<>();
    static Queue<String> qamar = new LinkedList<>();
    static Queue<String> gulam = new LinkedList<>();
    static Queue<String> muntazir = new LinkedList<>();

    static Queue<String> measum = new LinkedList<>();
    static Queue<String> uzar = new LinkedList<>();
    static Queue<String> imran = new LinkedList<>();
    static Queue<String> soohana = new LinkedList<>();

    static Queue<String> farhan = new LinkedList<>();
    static Queue<String> waqar = new LinkedList<>();
    static Queue<String> shakir = new LinkedList<>();
    static Queue<String> afzal = new LinkedList<>();



    static void displayWinner(){

        int zohaibVotes = zohaib.size();
        int qamarVotes = qamar.size();
        int gulamVotes = gulam.size();
        int muntazirVotes = muntazir.size();

        int measumVotes = measum.size();
        int uzarVotes = uzar.size();
        int imranVotes = imran.size();
        int soohanaVotes = soohana.size();

        int farhanVotes = farhan.size();
        int waqarVotes = waqar.size();
        int shakirVotes = shakir.size();
        int afzalVotes = afzal.size();

        String[] candidates = {"Zohaib Khan", "Qamar Abbas", "Gulam Mustafa", "Muntazir Mehdi",
                "Measum Abbas", "Uzar Ahmed", "Imran Ali", "Soohana Ali",
                "Farhan Ali", "Waqar Ali", "Shakir Ali", "Afzal Khan"};

        int[] votes = {zohaibVotes, qamarVotes, gulamVotes, muntazirVotes,
                measumVotes, uzarVotes, imranVotes, soohanaVotes,
                farhanVotes, waqarVotes, shakirVotes, afzalVotes};


        int maxVotes = 0;
        for (int v : votes) {
            if (v > maxVotes) {
                maxVotes = v;
            }
        }


        int countMax = 0;
        String topCandidate = "";
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == maxVotes) {
                countMax++;
                topCandidate = candidates[i];
            }
        }

        String Admin_password = "Chandesh12";
        System.out.print("Enter the admin password :");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        if (password.equals(Admin_password)) {


            System.out.println("===========================================================================");
            if (maxVotes == 0) {
                System.out.println("No votes have been cast yet.");
            } else if (countMax > 1) {
                System.out.println("Winner cannot be declared due to multiple candidates having the highest votes.");
            } else {
                System.out.println("Candidate with the Most Votes");
                System.out.println("Name: " + topCandidate);

                System.out.println("Total Votes: " + maxVotes);
            }
            System.out.println("===========================================================================");

        } else {
            System.out.print("Wrong password ");
        }
    }


    static void displayWinnerByDept() {

    Scanner scan = new Scanner(System.in);

    System.out.println("Select Department to Display Winner:");
    System.out.println("1. Computer Science");
    System.out.println("2. Business Management");
    System.out.println("3. Electrical Engineering");
    System.out.print("Enter choice (1-3): ");

    int choice = scan.nextInt();
    scan.nextLine();

    String[] candidates = null;
    int[] votes = null;

    switch (choice) {

        case 1:
            candidates = new String[]{
                "Zohaib Khan", "Qamar Abbas", "Gulam Mustafa", "Muntazir Mehdi"
            };
            votes = new int[]{
                zohaib.size(), qamar.size(), gulam.size(), muntazir.size()
            };
            break;

        case 2:
            candidates = new String[]{
                "Measum Abbas", "Uzar Ahmed", "Imran Ali", "Soohana Ali"
            };
            votes = new int[]{
                measum.size(), uzar.size(), imran.size(), soohana.size()
            };
            break;

        case 3:
            candidates = new String[]{
                "Farhan Ali", "Waqar Ali", "Shakir Ali", "Afzal Khan"
            };
            votes = new int[]{
                farhan.size(), waqar.size(), shakir.size(), afzal.size()
            };
            break;

        default:
            System.out.println("Invalid choice.");
            return;
    }

    int maxVotes = 0;
    for (int v : votes) {
        if (v > maxVotes) {
            maxVotes = v;
        }
    }

    int countMax = 0;
    String topCandidate = "";

    for (int i = 0; i < votes.length; i++) {
        if (votes[i] == maxVotes) {
            countMax++;
            topCandidate = candidates[i];
        }
    }

    String Admin_password = "Chandesh12";
    System.out.print("Enter the admin password : ");
    String password = scan.nextLine();

    if (password.equals(Admin_password)) {

        System.out.println("===========================================================================");

        if (maxVotes == 0) {
            System.out.println("No votes have been cast in this department yet.");
        } else if (countMax > 1) {
            System.out.println("Winner cannot be declared due to a tie in this department.");
        } else {
            System.out.println("Department Winner:");
            System.out.println("Name: " + topCandidate);
            System.out.println("Total Votes: " + maxVotes);
        }

        System.out.println("===========================================================================");

    } else {
        System.out.println("Wrong password!");
    }
}

    static void vote(String key, String value){

        String[] parts = key.toString().split("-");


        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        int num3 = Integer.parseInt(parts[2]);

        if(parts[0].equals("023")){

            System.out.println("Candidates in Election from Computer Science department are Given below: ");
            System.out.println("1) Zohaib Khan");
            System.out.println("2) Qamar Abbas");
            System.out.println("3) Gulam Mustafa");
            System.out.println("4) Muntazir Mehdi");

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the option to whom you want to vote: ");
            int count = scan.nextInt();


            switch (count) {
                case 1:
                    zohaib.add(value);
                    System.out.println("Thank you! Your vote for Zohaib Khan has been recorded.");
                    break;
                case 2:
                    qamar.add(value);
                    System.out.println("Thank you! Your vote for Qamar Abbas has been recorded.");
                    break;
                case 3:
                    gulam.add(value);
                    System.out.println("Thank you! Your vote for Gulam Mustafa has been recorded.");
                    break;
                case 4:
                    muntazir.add(value);
                    System.out.println("Thank you! Your vote for Muntazir Mehdi has been recorded.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
            }
        }
        else if (parts[0].equals("045")) {

            System.out.println("Candidates in Election from Business department are Given below: ");
            System.out.println("1) Measum Abbas");
            System.out.println("2) Uzar Ahmed");
            System.out.println("3) Imran Ali");
            System.out.println("4) Soohana Ali");

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the option to whom you want to vote: ");
            int count = scan.nextInt();


            switch (count) {
                case 1:
                    measum.add(value);
                    System.out.println("Thank you! Your vote for Measum Abbas has been recorded.");
                    break;
                case 2:
                    uzar.add(value);
                    System.out.println("Thank you! Your vote for Uzar Ahmed has been recorded.");
                    break;
                case 3:
                    imran.add(value);
                    System.out.println("Thank you! Your vote for Imran Ali has been recorded.");
                    break;
                case 4:
                    soohana.add(value);
                    System.out.println("Thank you! Your vote for Soohana Ali has been recorded.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
            }
        }
        else if (parts[0].equals("055")) {

            System.out.println("Candidates in Election from Electrical Engineering department are Given below: ");
            System.out.println("1) Farhan Ali");
            System.out.println("2) Waqar Ali");
            System.out.println("3) Shakir Ali");
            System.out.println("4) Afzal Khan");

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the option to whom you want to vote: ");
            int count = scan.nextInt();


            switch (count) {
                case 1:
                    farhan.add(value);
                    System.out.println("Thank you! Your vote for Farhan Ali has been recorded.");
                    break;
                case 2:
                    waqar.add(value);
                    System.out.println("Thank you! Your vote for Waqar Ali has been recorded.");
                    break;
                case 3:
                    shakir.add(value);
                    System.out.println("Thank you! Your vote for Shakir Ali has been recorded.");
                    break;
                case 4:
                    afzal.add(value);
                    System.out.println("Thank you! Your vote for Afzal Khan has been recorded.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
            }
        }
    }



       static void currentVoteCounts(){
            
        
        int zohaibVotes = zohaib.size();
        int qamarVotes = qamar.size();
        int gulamVotes = gulam.size();
        int muntazirVotes = muntazir.size();

        int measumVotes = measum.size();
        int uzarVotes = uzar.size();
        int imranVotes = imran.size();
        int soohanaVotes = soohana.size();



        int farhanVotes = farhan.size();
        int waqarVotes = waqar.size();
        int shakirVotes = shakir.size();
        int afzalVotes = afzal.size();

        String[] candidates = { "Zohaib Khan",  "Qamar Abbas","Gulam Mustafa",   "Muntazir Mehdi",
                                 "Measum Abbas" ,  "Uzar Ahmed" ,"Imran Ali",  "Soohana Ali",
                               "Farhan Ali ", "Waqar Ali", "Shakir Ali", "Afzal Khan"};

        int[] votes = {zohaibVotes , qamarVotes,gulamVotes, muntazirVotes,
                        measumVotes, uzarVotes, imranVotes ,  soohanaVotes,
                       farhanVotes  , waqarVotes, shakirVotes, afzalVotes};




        System.out.println( "=================================================" );
        System.out.println("          CURRENT ELECTION VOTE COUNT            ");
        System.out.println("=================================================") ;
        


        int totalVotesCast = 0;
        
       
        System.out.println("\n--- Computer Science Department ---");
           for (int i = 0; i < 4; i++){
             System.out.printf("%-20s : %d votes\n", candidates[i], votes[i]);
            totalVotesCast += votes[i];
        }

        System.out.println("\n--- Business Management Department ---");


            for (int i = 4; i < 8; i++){
            System.out.printf("%-20s : %d votes\n", candidates[i], votes[i]);
            totalVotesCast += votes[i];
        }

        System.out.println("\n--- Electrical Engineering Department ---");
        for (int i = 8; i < 12; i++){
               System.out.printf("%-20s : %d votes\n", candidates[i], votes[i]);
            totalVotesCast += votes[i];


        }


         System.out.println("\n-------------------------------------------------");
           System.out.println("TOTAL VOTES CAST: " + totalVotesCast);

        System.out.println("=================================================");
    }
       


        static void leastVote(){
                
        
        int zohaibVotes = zohaib.size();
        int qamarVotes = qamar.size();
        int gulamVotes = gulam.size();
        int muntazirVotes = muntazir.size();

        int measumVotes = measum.size();
        int uzarVotes = uzar.size();
        int imranVotes = imran.size();
        int soohanaVotes = soohana.size();

        int farhanVotes = farhan.size();
        int waqarVotes = waqar.size();
        int shakirVotes = shakir.size();
        int afzalVotes = afzal.size();

        String[] candidates = {"Zohaib Khan", "Qamar Abbas", "Gulam Mustafa", "Muntazir Mehdi",
                "Measum Abbas", "Uzar Ahmed", "Imran Ali", "Soohana Ali",
                "Farhan Ali", "Waqar Ali", "Shakir Ali", "Afzal Khan"};

        int[] votes = {zohaibVotes, qamarVotes, gulamVotes, muntazirVotes,
                measumVotes, uzarVotes, imranVotes, soohanaVotes,
                farhanVotes, waqarVotes, shakirVotes, afzalVotes};

     
        int minVotes = Integer.MAX_VALUE;
        boolean votesCast = false;

        for (int v : votes) {
            if (v < minVotes) {
                minVotes = v;
            }
            if (v > 0) {
                votesCast = true;
            }
        }

        Scanner scan = new Scanner(System.in);
        String Admin_password = "Chandesh12";
        System.out.print("Enter the admin password : ");
        String password = scan.nextLine();

        if (password.equals(Admin_password)) {

            System.out.println("===========================================================================");

            if (!votesCast) {
                System.out.println("No votes have been cast yet.");
            } else {
                System.out.println("Candidate(s) with the Least Votes:");
                
                boolean first = true;
                for (int i = 0; i < votes.length; i++) {
                    if (votes[i] == minVotes) {
                        if (!first) {
                            System.out.print(", ");
                        }
                        System.out.print(candidates[i]);
                        first = false;
                    }
                }
                
                System.out.println("\nTotal Votes: " + minVotes);
            }

            System.out.println("===========================================================================");

        } else {
            System.out.println("Wrong password!");
        }
    }


  
    static void resetVotes(VotingSystem.hashMap<String, String> map){

        Scanner scan = new Scanner(System.in);
        String Admin_password = "Chandesh12";


        System.out.print("Enter the admin password to confirm vote reset: ");
          String password = scan.nextLine();

        if (password.equals(Admin_password)){

            System.out.println("===========================================================================");
            System.out.print("WARNING! This will clear ALL votes. Are you sure? (Type 'YES' or Y to confirm): ");
            String confirmation = scan.nextLine();


            if (confirmation.equals("YES" ) || confirmation.equals("Yes" ) || confirmation.equals("yes") || confirmation.equals("y")){
               
                zohaib.clear();
                qamar.clear();
                gulam.clear();
                muntazir.clear();

                measum.clear();
                uzar.clear();
                imran.clear();
                soohana.clear();

                farhan.clear();
                 waqar.clear();
                shakir.clear();
                afzal.clear();

                

                map.clearAll(); 

                System.out.println(" All votes and voter records have been successfully reset.");
                System.out.println("===========================================================================");
             } 
            else {
                System.out.println("Reset cancelled. No votes were cleared.");
            }

            } 
             else  {
              System.out.println("Wrong password! Reset failed.");
             }
    }
    
        



    static void removeVote(VotingSystem.hashMap<String, String> map) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the CMS-ID of the voter: ");
    String voter = scan.nextLine();

    if (map.isProperFormat(voter)) {
        if (map.containsKey(voter)) {
            String name = map.get(voter);
            System.out.println("Candidate with CMS-ID: " + voter + " is " + name);
            System.out.print("Do you want to remove the voter’s vote? (y/n): ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("y")) {
                map.remove(voter);
                System.out.println("Vote successfully removed.");
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("Vote removal cancelled.");
            } else {
                System.out.println("Invalid input!");
            }
        } else {
            System.out.println("No vote found for this CMS-ID.");
        }
    } else {
        System.out.println("Enter a valid CMS-ID in the proper format (XXX-XX-XXXX).");
    }
}



    
    static void displayCS(){
        System.out.println("List of Voters of Which Candidate: ");
        System.out.println();
        System.out.println("1) Zohaib Khan");
        System.out.println("2) Qamar Abbas");
        System.out.println("3) Gulam Mustafa");
        System.out.println("4) Muntazir Mehdi");
        System.out.print("Enter your choice: ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int a=1;

        switch(choice) {
            case 1:
                System.out.println("Votes for Zohaib Khan: ");
                a =1;
                for (String voter : zohaib) {
                    System.out.println( "  " + (a++)+ " "+voter);
                }
                break;
            case 2:
                System.out.println("Votes for Qamar Abbas:");
                a=1;
                for (String voter : qamar) {
                    System.out.println( "  " + (a++)+" "+voter);
                }
                break;
            case 3:
                System.out.println("Votes for Gulam Mustafa:");
                for (String voter : gulam) {
                    System.out.println( "  " + (a++)+ " "+voter);
                }
                break;
            case 4:
                System.out.println("Votes for Muntazir Mehdi:");
                for (String voter : muntazir) {
                    System.out.println( "  " + (a++)+ " "+voter);
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
        }
    }


    static void displayBusiness() {
        System.out.println("List of Voters of Which Candidate: ");
        System.out.println();
        System.out.println("1) Measum Abbas");
        System.out.println("2) Uzar Ahmed");
        System.out.println("3) Imran Ali");
        System.out.println("4) Soohana Ali");
        System.out.print("Enter your choice: ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int a = 1;

        switch (choice) {
            case 1:
                System.out.println("Votes for Measum Abbas:");
                for (String voter : measum) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            case 2:
                System.out.println("Votes for Uzar Ahmed:");
                for (String voter : uzar) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            case 3:
                System.out.println("Votes for Imran Ali:");
                for (String voter : imran) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            case 4:
                System.out.println("Votes for Soohana Ali:");
                for (String voter : soohana) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
        }
    }



    static void displayElectrical() {
        System.out.println("List of Voters of Which Candidate: ");
        System.out.println();
        System.out.println("1) Farhan Ali");
        System.out.println("2) Waqar Ali");
        System.out.println("3) Shakir Ali");
        System.out.println("4) Afzal Khan");
        System.out.print("Enter your choice: ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int a = 1;

        switch (choice) {
            case 1:
                System.out.println("Votes for Farhan Ali:");
                for (String voter : farhan) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            case 2:
                System.out.println("Votes for Waqar Ali:");
                for (String voter : waqar) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            case 3:
                System.out.println("Votes for Shakir Ali:");
                for (String voter : shakir) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            case 4:
                System.out.println("Votes for Afzal Khan:");
                for (String voter : afzal) {
                    System.out.println("  " + (a++) + " " + voter);
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
        }
    }


}

class VotingSystem{

    static class hashMap<K, V> {
        class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;

                this.value = value;
            }
        }

        int n;
        int N;
        LinkedList<Node> buckets[];

        hashMap(){
            this.N = 4;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

        }

        int hashFunction(K key){
            int value = key.hashCode();
            return Math.abs(value)%N;
        }

        int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i=0; i< ll.size(); i++){
                if(  ll.get(i).key.equals(key)  ) return i;
            }
            return -1;
        }

        void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            N = N*2;
            buckets = new LinkedList[N];

            for(int i=0; i< N; i++){
                buckets[i] = new LinkedList<>();
            }

            n=0;

            for(int i = 0; i < oldBuckets.length; i++){
                LinkedList<Node> ll = oldBuckets[i];
                if(ll != null){
                    for(Node node : ll){
                        put(node.key, node.value);
                    }
                }
            }
        }



        boolean isProperFormat(K key){
            String str = key.toString();
            String format = "\\d{3}-\\d{2}-\\d{4}";
            return str.matches(format);
        }

        void put(K key, V value){

            if(!isProperFormat(key)) {
                System.out.println("Please Enter the CMS-ID in proper format ");
                return;
            }

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);


            if(di == -1){

                buckets[bi].add(new Node(key, value));
                n++;
                if(n>18){
                System.out.println("Kudos! You are Verified and Now you can caste vote ");
                
                Vote.vote(key.toString(), value.toString());
                }

            }
            else{
                System.out.println("Sorry, "+ value +" you can't cast vote because ID: "+ key +  " already exists");
            }

            double lambda = (double)n/N;
            if(lambda >= 2.0) rehash();

        }




        V get(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) return null;
            return buckets[bi].get(di).value;
        }


        void remove(K key){

            int bi = hashFunction(key );

            int di =searchInLL(key, bi );

            if (di != -1){
                buckets[bi].remove(di);
                n--;
            }
        }


        boolean  containsKey(K key){

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);
            return di != -1;
        }


        void  display(){

            for (int i = 0; i< N; i++ ) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    System.out.println(node.key + " => " + node.value);
                }
            }
        }


        void clearAll(){

        for (int i = 0; i < N; i++) {
        buckets[i].clear();
            }
             n = 0;
        }

    }

    public static void main(String args[]) {

    hashMap<String, String> map = new hashMap<>();

    map.put("023-24-0215", "Munsif Ali"); Vote.zohaib.add("Munsif Ali");
    map.put("023-24-0218", "Mehran Khan"); Vote.zohaib.add("Mehran Khan");
    map.put("023-24-0220", "Mussadique Hussain"); Vote.zohaib.add("Mussadique Hussain");

    map.put("023-24-0222", "Ali Raza"); Vote.qamar.add("Ali Raza");
    map.put("023-24-0225", "Ahsan Shah"); Vote.qamar.add("Ahsan Shah");

    map.put("023-24-0230", "Bilal Khan"); Vote.gulam.add("Bilal Khan");
    map.put("023-24-0232", "Danish Iqbal"); Vote.gulam.add("Danish Iqbal");

    map.put("023-24-0235", "Fahad Ali"); Vote.muntazir.add("Fahad Ali");

    map.put("045-24-0215", "Khair Muhammad"); Vote.measum.add("Khair Muhammad");
    map.put("045-24-0218", "Hashir Mubeen"); Vote.uzar.add("Hashir Mubeen");
    map.put("045-24-0220", "Sana Riaz"); Vote.imran.add("Sana Riaz");
    map.put("045-24-0222", "Zoya Ahmed"); Vote.soohana.add("Zoya Ahmed");

    map.put("055-24-0215", "Shayan Ali"); Vote.afzal.add("Shayan Ali");
    map.put("055-24-0218", "Abrish"); Vote.afzal.add("Abrish");
    map.put("055-24-0220", "Kamran Ali"); Vote.afzal.add("Kamran Ali");

    map.put("055-24-0222", "Farhan Ahmed"); Vote.farhan.add("Farhan Ahmed");
    map.put("055-24-0225", "Waqar Hussain"); Vote.waqar.add("Waqar Hussain");
    map.put("055-24-0228", "Shakir Khan"); Vote.shakir.add("Shakir Khan");

    
        System.out.println("             =========================");
        System.out.println("             |   SIBA Voting System  |");
        System.out.println("             =========================");


    Scanner scan = new Scanner(System.in);
    String input = "";

    do {
        System.out.println("----------------------------------------------------------------");
        System.out.println("       1) Cast a Vote");
        System.out.println("       2) Current Vote count");
        System.out.println("       3) View Voters of Candidate from a Specific Department");
        System.out.println("       4) Display all Voters");
        System.out.println("       5) Declar Winner                 (Only for Admin)");
        System.out.println("       6) Declar Winner by department   (Only for Admin)");
        System.out.println("       7) Remove vote of any voter      (Only for Admin)");
        System.out.println("       8) Candidate with least votes    (Only for Admin)");
        System.out.println("       9) Reset/Clear All Votes         (Only for Admin)");
        System.out.println("       10) Exit the System");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Enter your choice: ");

        input = scan.nextLine();

        switch (input) {
            case "1":
                System.out.print("Enter your CMS-ID: ");
                String cms = scan.nextLine();
                System.out.print("Enter your Name: ");
                String name = scan.nextLine();
                map.put(cms, name);
                break;


            case "2":
                Vote.currentVoteCounts();
             break;


            case "3":
                System.out.println("1) Computer Science Department");
                System.out.println("2) Business Department");
                System.out.println("3) Electrical Engineering Department");
                System.out.print("Enter your choice: ");
                String deptInput = scan.nextLine();
                if (deptInput.equals("1")) Vote.displayCS();
                else if (deptInput.equals("2")) Vote.displayBusiness();
                else if (deptInput.equals("3")) Vote.displayElectrical();
                else System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                break;

            case "4":
                map.display();
                break;

            case "5":
                Vote.displayWinner();
                break;

            case "6":
                Vote.displayWinnerByDept();
                break;

            case "7":
                Vote.removeVote(map);
                break;

            case "8": 
                Vote.leastVote();
            break;


            case "9":
                Vote.resetVotes(map);
            break;


            case "10":
                System.out.println("Exiting the system... Goodbye!");
                break;

            default:
                System.out.println("Invalid input! Please enter 1–10.");
        }

        System.out.println();

    } while (!input.equals("10"));
}

}