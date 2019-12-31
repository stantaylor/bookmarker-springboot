DROP TABLE IF EXISTS bookmarks;
DROP TABLE IF EXISTS bookmark;


CREATE TABLE `bookmark` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE bookmark AUTO_INCREMENT = 1000;

# INSERT INTO bookmark(title, url, created_at, updated_at) VALUES("bookmark 1", "http://www.bm1.com/", NOW(), NOW());
# INSERT INTO bookmark(title, url, created_at, updated_at) VALUES("bookmark 2", "http://www.bm2.com/", NOW(), NOW());
# INSERT INTO bookmark(title, url, created_at, updated_at) VALUES("bookmark 3", "http://www.bm3.com/", NOW(), NOW());

