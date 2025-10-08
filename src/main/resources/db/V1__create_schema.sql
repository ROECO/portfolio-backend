
CREATE TABLE IF NOT EXISTS about_sections (
                                              id BIGSERIAL PRIMARY KEY,
                                              title VARCHAR(255) NOT NULL,
                                              summary TEXT,
                                              full_description TEXT,
                                              image_url VARCHAR(500),
                                              slide_order INTEGER,
                                              is_active BOOLEAN DEFAULT TRUE,
                                              cta_text VARCHAR(255),
                                              cta_link VARCHAR(500),
                                              category VARCHAR(100),
                                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                              updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create trigger for updated_at if not exists
CREATE OR REPLACE FUNCTION update_updated_at_column()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.updated_at = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$ language 'plpgsql';

CREATE TRIGGER update_about_sections_updated_at BEFORE UPDATE ON about_sections
    FOR EACH ROW EXECUTE FUNCTION update_updated_at_column();

-- Similar structure for other tables
CREATE TABLE IF NOT EXISTS projects (
                                        id SERIAL PRIMARY KEY,
                                        name VARCHAR(255) NOT NULL,
                                        description TEXT,
                                        image_url VARCHAR(500),
                                        video_url VARCHAR(500),
                                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TRIGGER update_projects_updated_at BEFORE UPDATE ON projects
    FOR EACH ROW EXECUTE FUNCTION update_updated_at_column();

CREATE TABLE IF NOT EXISTS tools_languages (
                                               id SERIAL PRIMARY KEY,
                                               project_id INTEGER REFERENCES projects(id) ON DELETE CASCADE,
                                               tool_language VARCHAR(100) NOT NULL,
                                               position INTEGER DEFAULT 0,
                                               created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);