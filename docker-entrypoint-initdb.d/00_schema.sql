CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY,
    login TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    created TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE posts(
    id BIGSERIAL PRIMARY KEY,
    author_id BIGINT NOT NULL REFERENCES users,
    content TEXT,
    geo_lat FLOAT,
    geo_lng FLOAT,
    created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE  post_tags (
    post_id BIGINT NOT NULL  REFERENCES  posts,
    tag TEXT NOT NULL
);

CREATE TABLE user_roles (
    user_id BIGINT NOT NULL REFERENCES users,
    role TEXT NOT NULL
);
CREATE TABLE tokens (
    token TEXT PRIMARY KEY ,
    user_id BIGINT NOT NULL REFERENCES users,
    created timestamptz NOT NULL  DEFAULT   CURRENT_TIMESTAMP
)
