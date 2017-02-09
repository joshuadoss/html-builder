/**
 * Copyright (c) 2017 Joshua Doss. All rights reserved.
 */

package htmlbuilder.node;

import java.util.ArrayList;
import java.util.HashMap;

import htmlbuilder.Node;

/**
 * TODO: Explain.
 *
 * @author Joshua Doss
 * @version 1.0
 *
 */
public class AbstractNode implements Node {
	private static final String ID    = "id";

	private String tagName;

	private ArrayList<Node> children;
	private HashMap<String, String> attributes;
	private ArrayList<String> classNames;

	public AbstractNode(String tagName) {
		this.tagName    = tagName;
		
		this.children   = new ArrayList<Node>();
		this.attributes = new HashMap<String, String>();
		this.classNames = new ArrayList<String>();
	}
	
	public Node child(Node node) {
		this.children.add(node);
		return this;
	}

	public Node id(String id) {
		this.attributes.put(ID, id);
		return this;
	}

	public Node addClass(String className) {
		this.classNames.add(className);
		return this;
	}

	public Node attr(String key, String value) {
		this.attributes.put(key, value);
		return this;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder()
			.append("<")
			.append(this.tagName)
			.append(" ");
		
		if (!this.classNames.isEmpty()) {
			sb.append("class=\"");
			for (String className : this.classNames) {
				sb.append(className).append(" ");
			}
			sb.deleteCharAt(sb.lastIndexOf(" ")).append("\" ");
		}
		
		for (String key : this.attributes.keySet()) {
			sb.append(key)
				.append("=\"")
				.append(this.attributes.get(key))
				.append("\" ");
		}
		
		if (!this.children.isEmpty()) {
			sb.deleteCharAt(sb.lastIndexOf(" ")).append(">");
			for (Node child : this.children) {
				sb.append(child.toString());
			}
			sb.append("</")
				.append(this.tagName)
				.append(">");
		} else {
			sb.append("/>");
		}
		
		return sb.toString();
	}
}
