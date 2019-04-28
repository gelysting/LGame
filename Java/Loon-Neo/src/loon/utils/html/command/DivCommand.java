/**
 * Copyright 2008 - 2019 The Loon Game Engine Authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @project loon
 * @author cping
 * @email：javachenpeng@yahoo.com
 * @version 0.5
 */
package loon.utils.html.command;

import loon.HorizontalAlign;
import loon.canvas.LColor;
import loon.font.IFont;
import loon.opengl.GLEx;
import loon.utils.html.HtmlElement;
import loon.utils.html.css.CssStyleSheet;

public class DivCommand extends DisplayCommand {

	protected String text;

	protected LColor color;

	protected IFont font;

	private HorizontalAlign align;

	private boolean dirty;

	private HtmlElement node;

	private int sysSize;

	private int fontSize;

	private String fontName;
	
	public DivCommand(CssStyleSheet sheet, float width, float height, String fontName, int fontSize, LColor color) {
		super(sheet, "Text", width, height, color);
		this.fontName = fontName;
		this.fontSize = fontSize;

	}

	@Override
	public void update() {

	}

	@Override
	public void parser(HtmlElement e) {

	}

	@Override
	public void paint(GLEx g, float x, float y) {

	}

	@Override
	public void close() {

	}

}