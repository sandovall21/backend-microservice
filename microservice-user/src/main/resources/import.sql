INSERT INTO users (username, password, enabled, name, email) VALUES ('jesxsn', '$2a$10$GHdjZ04TPsxXQefBig40k.ANTkMnSSlCWFTWMAo7vDBKqdEwFIzMW', 1, 'Jesus Sando', 'jesxsn@gmail.com')
INSERT INTO users (username, password, enabled, name, email) VALUES ('mikel12', '$2a$10$PtAVcDawzaGqXtTXIf7D.eu1aHvitT9ojUmOXJQ2bTqUma7O2FSCC', 1, 'Miguel Danes', 'mikel12@gmail.com');

INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO user_to_roles (user_id, roles_id) VALUES (1,1);
INSERT INTO user_to_roles (user_id, roles_id) VALUES (2,2);
INSERT INTO user_to_roles (user_id, roles_id) VALUES (2,1);