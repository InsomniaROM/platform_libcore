
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The tagName parameter in the "createElement(tagName)"
 *    method is case-sensitive for XML documents.
 *    Retrieve the entire DOM document and invoke its 
 *    "createElement(tagName)" method twice.  Once for tagName
 *    equal to "address" and once for tagName equal to "ADDRESS"
 *    Each call should create a distinct Element node.  The
 *    newly created Elements are then assigned attributes 
 *    that are retrieved.
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-2141741547">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-2141741547</a>
*/
public final class documentcreateelementcasesensitive extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public documentcreateelementcasesensitive(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staff", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      Element newElement1;
      Element newElement2;
      String attribute1;
      String attribute2;
      doc = (Document) load("staff", true);
      newElement1 = doc.createElement("ADDRESS");
      newElement2 = doc.createElement("address");
      newElement1.setAttribute("district", "Fort Worth");
      newElement2.setAttribute("county", "Dallas");
      attribute1 = newElement1.getAttribute("district");
      attribute2 = newElement2.getAttribute("county");
      assertEquals("attrib1", "Fort Worth", attribute1);
      assertEquals("attrib2", "Dallas", attribute2);
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/documentcreateelementcasesensitive";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(documentcreateelementcasesensitive.class, args);
   }
}

