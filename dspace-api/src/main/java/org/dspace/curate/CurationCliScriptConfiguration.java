/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.curate;

import org.apache.commons.cli.Options;

public class CurationCliScriptConfiguration extends CurationScriptConfiguration<Curation> {

    @Override
    public Options getOptions() {
        options = super.getOptions();
        options.addOption("e", "eperson", true, "email address of curating eperson");
        options.getOption("e").setType(String.class);
        options.getOption("e").setRequired(true);
        return options;
    }
}
