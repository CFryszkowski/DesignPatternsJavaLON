package pl.sda.builder;



public class StringBuilderExample {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        String text = sb.append("ala ")
                .append("ma ")
                .append("kota ")
                .toString();

        System.out.println(text);
    }
}
