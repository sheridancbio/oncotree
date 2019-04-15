/*
 * Copyright (c) 2017-2019 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 * documentation provided hereunder is on an "as is" basis, and
 * Memorial Sloan-Kettering Cancer Center
 * has no obligations to provide maintenance, support,
 * updates, enhancements or modifications.  In no event shall
 * Memorial Sloan-Kettering Cancer Center
 * be liable to any party for direct, indirect, special,
 * incidental or consequential damages, including lost profits, arising
 * out of the use of this software and its documentation, even if
 * Memorial Sloan-Kettering Cancer Center
 * has been advised of the possibility of such damage.
*/

package org.mskcc.oncotree.topbraid;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.mskcc.oncotree.model.Version;

import org.springframework.stereotype.Repository;

@Repository
public class OncoTreeVersionRepositoryHardcoded {

    private static final Logger logger = LoggerFactory.getLogger(OncoTreeVersionRepositoryHardcoded.class);

    private static ArrayList<Version> hardcodedVersionList = null;

    public static Version createVersion(String versionId, String graphURI, String description, boolean visible, String releaseDate) {
        Version version = new Version();
        version.setVersion(versionId);
        version.setGraphURI(graphURI);
        version.setDescription(description);
        version.setVisible(visible);
        version.setAdditionalProperty("release_date", releaseDate);
        return version;
    }

    public static void initializeHardcodedVersionList() {
        hardcodedVersionList = new ArrayList<Version>();
        hardcodedVersionList.add(createVersion("oncotree_legacy_1.1", "NA", "This is the closest match in TopBraid for the TumorTypes_txt file associated with release 1.1 of OncoTree (approved by committee)", false, "2016-03-28"));
        hardcodedVersionList.add(createVersion("oncotree_2017_06_21", "NA", "Stable OncoTree released on date 2017-06-21", false, "2017-06-21"));
        hardcodedVersionList.add(createVersion("oncotree_2017_10_05", "NA", "Stable OncoTree released on date 2017-10-05", false, "2017-10-05"));
        hardcodedVersionList.add(createVersion("oncotree_2017_11_01", "NA", "Stable OncoTree released on date 2017-11-01", false, "2017-11-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_01_01", "NA", "Stable OncoTree released on date 2018-01-01", false, "2018-01-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_02_01", "NA", "Stable OncoTree released on date 2018-02-01", false, "2018-02-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_03_01", "NA", "Stable OncoTree released on date 2018-03-01", false, "2018-03-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_04_01", "NA", "Stable OncoTree released on date 2018-04-01", false, "2018-04-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_05_01", "NA", "Stable OncoTree released on date 2018-05-01", false, "2018-05-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_06_01", "NA", "Stable OncoTree released on date 2018-06-01", false, "2018-06-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_06_15", "NA", "Stable OncoTree released on date 2018-06-15", false, "2018-06-15"));
        hardcodedVersionList.add(createVersion("oncotree_2018_07_01", "NA", "Stable OncoTree released on date 2018-07-01", false, "2018-07-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_08_01", "NA", "Stable OncoTree released on date 2018-08-01", false, "2018-08-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_09_01", "NA", "Stable OncoTree released on date 2018-09-01", false, "2018-09-01"));
        hardcodedVersionList.add(createVersion("oncotree_2018_11_01", "NA", "Stable OncoTree released on date 2018-11-01", false, "2018-11-01"));
        hardcodedVersionList.add(createVersion("oncotree_2019_02_01", "NA", "Stable OncoTree released on date 2019-02-01", false, "2019-02-01"));
        hardcodedVersionList.add(createVersion("oncotree_2019_03_01", "NA", "Stable OncoTree released on date 2019-03-01", false, "2019-03-01"));
        hardcodedVersionList.add(createVersion("oncotree_latest_stable", "NA", "This is the latest approved version for public use.",  true, "2019-03-01"));
        hardcodedVersionList.add(createVersion("oncotree_candidate_release", "NA", "This version of the OncoTree reflects upcoming changes which have been approved for the next public release of oncotree. The next public release is very likely to contain all changes in this version, and possibly additional oncotree nodes, if approved.",  true, "2019-03-02"));
        hardcodedVersionList.add(createVersion("oncotree_development", "NA", "Latest OncoTree under development (subject to &lt;b class=text-danger&gt;change without notice&lt;/b&gt;)", true, "2019-03-03"));
    }

    /**
     * @return all OncoTree versions ordered by ascending release date (development last)
     */
    public List<Version> getOncoTreeVersions() throws TopBraidException {
        if (hardcodedVersionList == null) {
            initializeHardcodedVersionList();
        }
        return hardcodedVersionList;
    }
}
