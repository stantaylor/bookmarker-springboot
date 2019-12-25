DROP TABLE IF EXISTS bookmarks;
DROP TABLE IF EXISTS bookmark;


CREATE TABLE `bookmark` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `insert_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;


INSERT INTO bookmark(title, url) VALUES ("Google", "https://www.google.com");
INSERT INTO bookmark(title, url) VALUES ("Facebook", "https://www.facebook.com");
INSERT INTO bookmark(title, url) VALUES ("Twitter", "https://www.twitter.com");

SELECT * FROM bookmark;
