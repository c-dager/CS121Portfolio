import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class StudentParse {
    public static void main(String[] args) {
        try {
            File input = new File("student_record.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(input);
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList studentList = doc.getElementsByTagName("student");
            for(int i = 0; i < studentList.getLength(); ++i){
                Node node = studentList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("First name: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Birth year: " + element.getElementsByTagName("dob").item(0).getTextContent());
                    System.out.println("Major: " + element.getElementsByTagName("major").item(0).getTextContent());
                    System.out.println();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
