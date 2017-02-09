#!/usr/bin/perl -w

use strict;
use FileHandle;

my @tags = (
	'a',
	'abbr',
	'address',
	'area',
	'article',
	'aside',
	'audio',
	'b',
	'base',
	'bdi',
	'bdo',
	'blockquote',
	'body',
	'br',
	'button',
	'canvas',
	'caption',
	'cite',
	'code',
	'col',
	'colgroup',
	'data',
	'datalist',
	'dd',
	'del',
	'details',
	'dfn',
	'dialog',
	'div',
	'dl',
	'dt',
	'em',
	'embed',
	'fieldset',
	'figcaption',
	'figure',
	'footer',
	'form',
	'h1',
	'h2',
	'h3',
	'h4',
	'h5',
	'h6',
	'head',
	'header',
	'hgroup',
	'hr',
	'html',
	'i',
	'iframe',
	'img',
	'input',
	'ins',
	'kbd',
	'keygen',
	'label',
	'legend',
	'li',
	'link',
	'main',
	'map',
	'mark',
	'menu',
	'menuitem',
	'meta',
	'meter',
	'nav',
	'noscript',
	'object',
	'ol',
	'optgroup',
	'option',
	'output',
	'p',
	'param',
	'pre',
	'progress',
	'q',
	'rb',
	'rp',
	'rt',
	'rtc',
	'ruby',
	's',
	'samp',
	'script',
	'section',
	'select',
	'small',
	'source',
	'span',
	'strong',
	'style',
	'sub',
	'summary',
	'sup',
	'table',
	'tbody',
	'td',
	'template',
	'textarea',
	'tfoot',
	'th',
	'thead',
	'time',
	'title',
	'tr',
	'track',
	'u',
	'ul',
	'var',
	'video',
	'wbr'
);

my $convenience_methods = "";

foreach my $tag (@tags) {
	my $uctag = ucfirst $tag;
	my $fh    = FileHandle->new('src/main/java/htmlbuilder/node/'.$uctag.'.java', 'w');
print $fh <<EOF;
/**
 * Copyright (c) 2017 Joshua Doss. All rights reserved.
 */

package htmlbuilder.node;

/**
 * TODO: Explain.
 *
 * \@author Joshua Doss
 * \@version 1.0
 *
 */
public class $uctag extends AbstractNode {
	public $uctag() {
		super("$tag");
	}
}
EOF
	$fh->close();

$convenience_methods .= <<EOM;

	/**
	 * 
	 */
	public static $uctag $tag() {
		return new $uctag();
	}
EOM
}

my $fh = FileHandle->new('src/main/java/htmlbuilder/Tags.java', 'w');
print $fh <<EOC;
/**
 * Copyright (c) 2017 Joshua Doss. All rights reserved.
 */

package htmlbuilder;

import htmlbuilder.node.*;

/**
 * TODO: Explain.
 *
 * \@author Joshua Doss
 * \@version 1.0
 *
 */
public class Tags {
	$convenience_methods
}
EOC
$fh->close();