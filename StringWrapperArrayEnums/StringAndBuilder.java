public class StringAndBuilder {
    public static void main(String[] args) {
        
        String s = "Shahaam";
        System.out.println(s);
        System.out.println(s.charAt(2));

        // instantiating through a String
        StringBuilder sb = new StringBuilder("Me Testing String Builder");
        sb.append(" For the First Time");
        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        // Instantiating through Capacity
        // Altough it can resize itself Automatically
        // But allocating enough cap before-hand
        // is faster and efficient
        // Empty Constructer initializes with the Cap of 16
        StringBuilder sbIndexed = new StringBuilder(20);
        sbIndexed.append("Capacity is ");
        System.out.print(sbIndexed);
        System.out.println(sbIndexed.capacity());
        
        CharSequence cs = "Character Sequence";
    
        StringBuilder sbCharSeq = new StringBuilder(cs);
        sbCharSeq.delete(sbCharSeq.indexOf("ac"), sbCharSeq.indexOf("S"));
        System.out.println(sbCharSeq);

        StringBuilder name = new StringBuilder("Muhammad Shahaam");
        name.insert(name.length(), " Siddiqui");
        System.out.println(name);

    
    }
}