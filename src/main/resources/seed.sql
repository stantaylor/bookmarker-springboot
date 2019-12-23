DROP TABLE IF EXISTS bookmarks;
CREATE TABLE bookmarks (
    id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    url TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=INNODB;

INSERT INTO bookmarks(id, title, url) VALUES (213123, "Google", "https://www.google.com");
INSERT INTO bookmarks(id, title, url) VALUES (111111, "Facebook", "https://www.facebook.com");
INSERT INTO bookmarks(id, title, url) VALUES (34343433, "Twitter", "https://www.twitter.com");

SELECT * FROM bookmarks;
