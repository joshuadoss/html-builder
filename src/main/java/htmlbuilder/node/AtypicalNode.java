/**
 * Copyright (c) 2017 Joshua Doss. All rights reserved.
 */

package htmlbuilder.node;

import htmlbuilder.Node;

/**
 * TODO: Explain.
 *
 * @author Joshua Doss
 * @version 1.0
 *
 */
public abstract class AtypicalNode implements Node {
	/* (non-Javadoc)
	 * @see htmlbuilder.Node#child(htmlbuilder.Node)
	 */
	public Node child(Node node) {
		// NOOP
		return this;
	}

	/* (non-Javadoc)
	 * @see htmlbuilder.Node#id(java.lang.String)
	 */
	public Node id(String id) {
		// NOOP
		return this;
	}

	/* (non-Javadoc)
	 * @see htmlbuilder.Node#addClass(java.lang.String)
	 */
	public Node addClass(String className) {
		// NOOP
		return this;
	}

	/* (non-Javadoc)
	 * @see htmlbuilder.Node#attr(java.lang.String, java.lang.String)
	 */
	public Node attr(String key, String value) {
		// NOOP
		return this;
	}

	public void render() {
		System.out.println(this.toString());
	}
}
