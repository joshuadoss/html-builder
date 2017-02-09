/**
 * Copyright (c) 2012 Joshua Doss. All rights reserved.
 */

package htmlbuilder.node;

/**
 * TODO: Explain.
 *
 * @author Joshua Doss
 * @version 1.0
 *
 */
public class Text extends AtypicalNode {
	private String text;
	
	public Text(String text) {
		this.text = text;
		
	}

	public String toString() {
		return this.text;
	}
}
