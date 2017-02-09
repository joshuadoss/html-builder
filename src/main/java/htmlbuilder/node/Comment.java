/**
 * Copyright (c) 2017 Joshua Doss. All rights reserved.
 */

package htmlbuilder.node;

/**
 * TODO: Explain.
 *
 * @author Joshua Doss
 * @version 1.0
 *
 */
public class Comment extends AtypicalNode {
	private String comment;

	public Comment(String comment) {
		this.comment = comment;
	}
	
	public String toString() {
		return "<!-- "+this.comment+" -->";
	}
}
