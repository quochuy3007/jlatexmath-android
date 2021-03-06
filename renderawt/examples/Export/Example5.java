/* Example5.java
 * =========================================================================
 * This file is part of the JLaTeXMath Library - http://jlatexmath.sourceforge.net
 * 
 * Copyright (C) 2009 DENIZET Calixte
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with the source distribution of this program (see
 * the META-INF directory in the source jar). This license can also be
 * found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 * 
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 * 
 */

import java.io.IOException;

/**
 * A class to test LaTeX rendering.
 **/
public class Example5 {
    public static void main(String[] args) {
	
	String latex = "\\begin{array}{|c|l|||r|c|}";
	latex += "\\hline";
	latex += "\\text{Matrix}&\\multicolumn{2}{|c|}{\\text{Multicolumns}}&\\text{Font sizes commands}\\cr";
	latex += "\\hline";
	latex += "\\begin{pmatrix}\\alpha_{11}&\\cdots&\\alpha_{1n}\\cr\\hdotsfor{3}\\cr\\alpha_{n1}&\\cdots&\\alpha_{nn}\\end{pmatrix}&\\Large \\text{Large Right}&\\small \\text{small Left}&\\tiny \\text{tiny Tiny}\\cr";
	latex += "\\hline";
	latex += "\\multicolumn{4}{|c|}{\\Huge \\text{Huge Multicolumns}}\\cr";
	latex += "\\hline";
	latex += "\\end{array}";

        try {
	    Convert.toSVG(latex, "Example5.svg", false);
            Convert.toSVG(latex, "Example5_shaped.svg", true);
            Convert.SVGTo("Example5.svg", "Example5.pdf", Convert.PDF);
            Convert.SVGTo("Example5_shaped.svg", "Example5_shaped.pdf", Convert.PDF);
            Convert.SVGTo("Example5.svg", "Example5.ps", Convert.PS);
            Convert.SVGTo("Example5.svg", "Example5.eps", Convert.EPS);
	} catch (IOException ex) {}
    }    
}