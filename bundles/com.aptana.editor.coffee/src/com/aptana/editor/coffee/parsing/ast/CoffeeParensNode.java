/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.coffee.parsing.ast;

public class CoffeeParensNode extends CoffeeNode
{

	public CoffeeParensNode(CoffeeNode body)
	{
		super(CoffeeNodeTypes.PARENS);
		addChild(body);
	}

	@Override
	public String getText()
	{
		return "Parens"; //$NON-NLS-1$
	}

	public CoffeeNode unwrap()
	{
		return (CoffeeNode) getChild(0);
	}

	public boolean isComplex()
	{
		return unwrap().isComplex();
	}
}
