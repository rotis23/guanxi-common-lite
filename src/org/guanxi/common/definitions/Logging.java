//: "The contents of this file are subject to the Mozilla Public License
//: Version 1.1 (the "License"); you may not use this file except in
//: compliance with the License. You may obtain a copy of the License at
//: http://www.mozilla.org/MPL/
//:
//: Software distributed under the License is distributed on an "AS IS"
//: basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
//: License for the specific language governing rights and limitations
//: under the License.
//:
//: The Original Code is Guanxi (http://www.guanxi.uhi.ac.uk).
//:
//: The Initial Developer of the Original Code is Alistair Young alistair@smo.uhi.ac.uk.
//: Portions created by SMO WWW Development Group are Copyright (C) 2005 SMO WWW Development Group.
//: All Rights Reserved.
//:
/* CVS Header
   $Id$
   $Log$
   Revision 1.8  2006/07/25 14:17:38  alistairskye
   Updated to split log dirs into Engine and Guard versions as the Guard should log inside WEB-INF/guanxi_sp_guard

   Revision 1.7  2006/01/26 08:55:59  alistairskye
   Split DEFAULT_SP_CONFIG_FILE into DEFAULT_SP_GUARD_CONFIG_FILE and DEFAULT_SP_ENGINE_CONFIG_FILE as the Guard is embedded

   Revision 1.6  2006/01/21 18:36:50  alistairskye
   Removed DEFAULT_LOG_DIR and added DEFAULT_IDP_LOG_DIR and DEFAULT_SP_LOG_DIR

   Revision 1.5  2006/01/21 17:06:50  alistairskye
   Updated new WEB-INF/guanxi_idp directory

   Revision 1.4  2005/09/22 08:34:08  alistairskye
   IdP and SP now have separate log4j config files

   Revision 1.3  2005/08/12 12:47:29  alistairskye
   Added license

   Revision 1.2  2005/07/21 09:15:12  alistairskye
   Added javadoc

   Revision 1.1  2005/07/21 09:14:02  alistairskye
   System wide Logging definitions

*/

package org.guanxi.common.definitions;

/**
 * <font size=5><b></b></font>
 *
 * @author Alistair Young alistair@smo.uhi.ac.uk
 */
public class Logging {
  /** The location where IdP plugins and system classes can put their log files */
  public static final String DEFAULT_IDP_LOG_DIR = "/WEB-INF/guanxi_idp/logs/";

  /** The IdP's logging config file */
  public static final String DEFAULT_IDP_CONFIG_FILE = "/WEB-INF/guanxi_idp/config/idp-log4j.xml";

  /** Where the Engine and Guard can put their log files */
  public static final String DEFAULT_SP_ENGINE_LOG_DIR = "/WEB-INF/logs/";

  /** Where the Engine and Guard can put their log files */
  public static final String DEFAULT_SP_GUARD_LOG_DIR = "/WEB-INF/guanxi_sp_guard/logs/";

  /** The SP Engine's logging config file */
  public static final String DEFAULT_SP_ENGINE_CONFIG_FILE = "/WEB-INF/config/sp-log4j.xml";

  /** The SP Guard's logging config file */
  public static final String DEFAULT_SP_GUARD_CONFIG_FILE = "/WEB-INF/guanxi_sp_guard//config/sp-log4j.xml";

  /** Default date format for loggers to use */
  public static final String DEFAULT_LAYOUT = "%d{dd MMMM yyyy HH:mm:ss} - %m%n";
}
