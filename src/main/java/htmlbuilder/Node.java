/**
 * Copyright (c) 2017 Joshua Doss. All rights reserved.
 */

package htmlbuilder;

/**
 * TODO: Explain.
 *
 * @author Joshua Doss
 * @version 1.0
 *
 */
public interface Node {
	/**
	 * Adds a node as a child to this node.
	 * 
	 * @param node
	 * @return
	 */
	public Node child(Node node);

	/**
	 * Adds a text Node to the current Node.
	 * 
	 * @param text
	 * @return
	 */
	public Node child(String text);

	/**
	 * Gives the node an id.
	 * 
	 * @param id
	 * @return
	 */
	public Node id(String id);
	
	/**
	 * Adds a classname to a Node.
	 * 
	 * @param className
	 * @return
	 */
	public Node addClass(String className);

	/**
	 * Adds a style attribute to a node. It's a convenience method for
	 * {@code Node#attr("style", style)}
	 * 
	 * @param style
	 * @return
	 */
	public Node style(String style);
	
	/**
	 * Provides a catch-all for other Node attributes like "method" for post tags or rel for other tags.
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public Node attr(String key, String value);
	
	/**
	 * Renders the HTML tree for this node.
	 */
	public void render();
}
