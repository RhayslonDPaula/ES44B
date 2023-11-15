Use barber;

CREATE TABLE IF NOT EXISTS teste(
	tes_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, -- Not null com auto increment é redundante, mas coloquei porque eu quis.
    tes_string VARCHAR(45),
    tes_int INT
);

Select * from teste;
