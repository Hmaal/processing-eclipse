/**
 * Copyright (c) 2010 Ben Fry and Casey Reas
 *
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * Contributors:
 *     Chris Lonnen - initial API and implementation
 */
package processing.plugin.ui.editor.util;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

/** 
 * Detects Processing whitespace.
 * <p>
 * Processing whitespace is the same as Java whitespace, so this is all 
 * a big wrapper for <code>Characer.isWhitespace()</code>. The method
 * itself is not static because it has to implement the IWhitespaceDetector
 * interface.
 */
public class ProcessingWhitespaceDetector implements IWhitespaceDetector {

		public boolean isWhitespace(char character) {
			return Character.isWhitespace(character);
		}
	
}
