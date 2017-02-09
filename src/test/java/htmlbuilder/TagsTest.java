/**
 * Copyright (c) 2012 Joshua Doss. All rights reserved.
 */

package htmlbuilder;

import static htmlbuilder.Tags.*;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * TODO: Explain.
 *
 * @author Joshua Doss
 * @version 1.0
 *
 */
public class TagsTest {

	@Test
	public void test() {
		table()
			.id("test")
			.attr("style", "width:100%")
			.child(
				tr()
					.attr("style", "color:white;background:black;")
					.child(
						td()
							.addClass("hello")
							.addClass("world")
							.child(
								text("Hello")
							)
					)
			).render();
		assertTrue(true);
	}

}
