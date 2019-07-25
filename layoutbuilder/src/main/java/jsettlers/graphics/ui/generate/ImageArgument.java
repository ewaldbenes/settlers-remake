/*******************************************************************************
 * Copyright (c) 2015
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.graphics.ui.generate;

import java.util.Locale;

import org.xml.sax.Attributes;

public class ImageArgument extends AbstractArgument {

	private String name;
	private int imageIndex;

	public ImageArgument(Attributes attributes) {
		int file = Integer.parseInt(attributes.getValue("file"));
		int sequence = Integer.parseInt(attributes.getValue("sequence"));
		imageIndex = 0;
		String type = attributes.getValue("type");
		name = String.format(Locale.ENGLISH, "original_%d_%s_%d", file, type, sequence);
	}

	@Override
	public String getArgumentSource() {
		// FIXME: Escape string.
		return "jsettlers.common.images.ImageLink.fromName(\"" + name + "\", " + imageIndex + ")";
	}
}
