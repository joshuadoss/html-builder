/**
 * Copyright (c) 2012 Joshua Doss. All rights reserved.
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
	 * TODO: Explain.
	 * @param node
	 * @return
	 */
	public Node child(Node node);
	
	/**
	 * TODO: Explain.
	 * @param id
	 * @return
	 */
	public Node id(String id);
	
	/**
	 * TODO: Explain.
	 * @param className
	 * @return
	 */
	public Node addClass(String className);
	
	/**
	 * TODO: Explain.
	 * @param key
	 * @param value
	 * @return
	 */
	public Node attr(String key, String value);
}
