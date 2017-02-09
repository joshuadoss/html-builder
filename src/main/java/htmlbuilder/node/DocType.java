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
public class DocType extends AtypicalNode {
	private String documentType;

	public DocType(String documentType) {
		this.documentType = documentType;
	}

	public String toString() {
		return "<!DOCTYPE "+this.documentType+">";
	}
}
