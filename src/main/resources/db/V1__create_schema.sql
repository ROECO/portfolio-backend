CREATE TABLE IF NOT EXISTS projects (
                                        id          SERIAL PRIMARY KEY,
                                        name        VARCHAR(255) NOT NULL UNIQUE,
                                        description VARCHAR(255) NOT NULL,
                                        image_url   VARCHAR(255),
                                        video_url   VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS tools_languages (
                                               project_id     INT NOT NULL,
                                               tool_language  VARCHAR(255) NOT NULL,
                                               position       INT NOT NULL,
                                               PRIMARY KEY (project_id, position),
                                               CONSTRAINT fk_tools_project FOREIGN KEY (project_id)
                                                   REFERENCES projects(id) ON DELETE CASCADE
);
