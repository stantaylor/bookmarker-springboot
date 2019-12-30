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

INSERT INTO bookmark(title, url) VALUES("bookmark 1", "http://www.bm1.com/");
INSERT INTO bookmark(title, url) VALUES("bookmark 2", "http://www.bm2.com/");
INSERT INTO bookmark(title, url) VALUES("bookmark 3", "http://www.bm3.com/");

