import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class prac {
    public static void main(String[] args) {
        String key = "";
        String value = "";
for(Object k : System.getProperties().keySet()){
     key = k.toString();
     value = System.getProperty(key);
    System.out.println(key + " = " + value);

}
String s = "자바 환경 정보";
        try {
            File file = new File("index.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("<h2 color = #666>" + s + "</h2>");
            writer.write("<style>");
            writer.write("table{border-collapse:collapse; width:100%}");
            writer.write("th, td{border:solid 1px #000}");
            writer.write("</style>");
            writer.write("<table border : 1px>");
            writer.write("<meta charset=\"UTF-8\">");
            writer.write("<td style = text-align:center>" + "키" + "</td>");
            writer.write("</td>");
            for(Object k : System.getProperties().keySet()){
                key = k.toString();
                value = System.getProperty(key);
                writer.write("<tr>");
                writer.write("<td>" + key + "</td>");
                writer.write("<td>" + value + "</td>");
                writer.write("</tr>");
            }
            writer.write("</table>");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
