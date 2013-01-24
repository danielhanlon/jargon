#!/bin/sh

exec `iadmin asq "SELECT DISTINCT r_coll_main.coll_id, r_coll_main.parent_coll_name, r_coll_main.coll_name, r_coll_main.coll_owner_name, r_coll_main.coll_owner_zone, r_meta_main.meta_id, r_meta_main.meta_namespace, r_meta_main.meta_attr_name, r_meta_main.meta_attr_value,r_meta_main.meta_attr_unit FROM r_coll_main JOIN r_objt_metamap ON r_coll_main.coll_id = r_objt_metamap.object_id JOIN r_meta_main ON r_objt_metamap.meta_id = r_meta_main.meta_id WHERE r_meta_main.meta_attr_unit = 'iRODSUserTagging:Share' AND r_coll_main.coll_owner_name = ? AND r_coll_main.coll_owner_zone = ? ORDER BY r_coll_main.parent_coll_name ASC, r_coll_main.coll_name ASC" listSharedCollectionsOwnedByUser`

