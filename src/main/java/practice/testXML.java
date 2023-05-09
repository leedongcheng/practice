package practice;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.Iterator;

public class testXML {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = factory.newDocumentBuilder();

        File file = new ClassPathResource("xml/saml2Response.xml").getFile();
        String xml = readFromFile(file);
        System.out.println("xml = " + xml);

        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element rootElement = document.getRootElement();
        Iterator attributeIterator = rootElement.attributeIterator();
        Iterator elementIterator = rootElement.elementIterator();


        while (attributeIterator.hasNext()) {//開始遍歷，呼叫hasNext()的方法，判斷是否有下一個
            Attribute attribute = (Attribute) attributeIterator.next();//獲取根標籤所有的屬性，
            System.out.println(attribute.getName() + ":" + attribute.getValue());//得到屬性名和對應的屬性值，即key-value
        }

        while (elementIterator.hasNext()) {
            Element element = (Element) elementIterator.next();//獲取根標籤以下所有子節點，
            System.out.println("element.Name => " + element.getName());//得到子節點名
        }

        Iterator attributeStatementElementIterator = rootElement.element("Assertion").element("AttributeStatement").elementIterator();

        String email = "";
        while (attributeStatementElementIterator.hasNext()) {
            Element attributeStatementElement = (Element) attributeStatementElementIterator.next();//獲取根標籤以下所有子節點，
//            System.out.println("AttributeStatement.Attribute.Name = "+attributeStatementElement.attributeValue("Name"));//得到子節點名
            //取得標籤中的文字
//            System.out.println("<AttributeValue>"+attributeStatementElement.element("AttributeValue").getStringValue()+"</AttributeValue>");
            if (attributeStatementElement.attributeValue("Name").equals("http://www.ntu.edu.tw/Email")) {
                email = attributeStatementElement.element("AttributeValue").getStringValue();
            }
        }
        System.out.println("Email = " + email);
//        StringReader StringReader = new StringReader(xml);
//        InputSource InputSource = new InputSource(StringReader);
//        Document doc = docBuilder.parse(InputSource);
////        doc.getDocumentElement().normalize();
//        System.out.println("root element = "+doc.getDocumentElement().getTagName());
//        NodeList nodeList = doc.getElementsByTagName("AttributeStatement");
//        for (int i = 0; i < nodeList.getLength(); i++) {
//            Node node = nodeList.item(i);
//            System.out.println("Current Element: " + node.getNodeName()+"; nodeList.getLength() = "+nodeList.getLength());
//        }
//        StringReader.close();
    }

    
    private static String readFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        return readFromInputStream(is);
    }

    private static String readFromInputStream(InputStream is) throws IOException {

        StringBuilder sb = new StringBuilder();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }
        br.close();
        isr.close();
        return sb.toString();
    }
}
