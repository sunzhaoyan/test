package com.test.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXml {
	public static void main(String[] args) {
		String path = "D:\\Workspaces\\itrus\\test\\src\\book.xml";
		File xmlFile = new File(path);
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = builder.parse(xmlFile);
			document.getDocumentElement().normalize();
			System.out.println("Root  element: " + document.getDocumentElement().getNodeName());
			NodeList nList = document.getElementsByTagName("book");

			for (int i = 0; i < nList.getLength(); i++) {
				Node node = nList.item(i);
				System.out.println("Node name: " + node.getNodeName());
				Element ele = (Element) node;
				System.out.println("----------------------------");
				if (node.getNodeType() == Element.ELEMENT_NODE) {
					System.out.println("book category: " + ele.getAttribute("category"));
					System.out.println("title name: " + ele.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("author name: " + ele.getElementsByTagName("author").item(0).getTextContent());
					System.out.println("year :" + ele.getElementsByTagName("year").item(0).getTextContent());
					System.out.println("price : " + ele.getElementsByTagName("price").item(0).getTextContent());
					System.out.println("-------------------------");
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
