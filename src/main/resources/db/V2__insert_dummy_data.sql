INSERT INTO projects (name, description, image_url, video_url)
VALUES
    ('Portfolio Backend', 'Spring Boot + PostgreSQL backend for my portfolio site.', 'https://picsum.photos/seed/backend/400/300', NULL),
    ('Portfolio Frontend', 'React + TypeScript frontend for the portfolio.', 'https://picsum.photos/seed/frontend/400/300', 'https://www.youtube.com/watch?v=dummy1'),
    ('IoT Dashboard', 'Monitor IoT devices and sensors in real time.', 'https://picsum.photos/seed/iot/400/300', 'https://www.youtube.com/watch?v=dummy2'),
    ('AI Chatbot', 'Simple chatbot using Python and NLP libraries.', 'https://picsum.photos/seed/chatbot/400/300', NULL),
    ('Game Prototype', 'Small 2D game demo built with Unity.', 'https://picsum.photos/seed/game/400/300', 'https://www.youtube.com/watch?v=dummy3');

-- Now retrieve the auto-generated IDs and use them for tools_languages
INSERT INTO tools_languages (project_id, tool_language, position)
SELECT p.id, 'Java', 0 FROM projects p WHERE p.name = 'Portfolio Backend'
UNION ALL
SELECT p.id, 'Spring Boot', 1 FROM projects p WHERE p.name = 'Portfolio Backend'
UNION ALL
SELECT p.id, 'PostgreSQL', 2 FROM projects p WHERE p.name = 'Portfolio Backend'
UNION ALL
SELECT p.id, 'TypeScript', 0 FROM projects p WHERE p.name = 'Portfolio Frontend'
UNION ALL
SELECT p.id, 'React', 1 FROM projects p WHERE p.name = 'Portfolio Frontend'
UNION ALL
SELECT p.id, 'TailwindCSS', 2 FROM projects p WHERE p.name = 'Portfolio Frontend'
UNION ALL
SELECT p.id, 'JavaScript', 0 FROM projects p WHERE p.name = 'IoT Dashboard'
UNION ALL
SELECT p.id, 'Node.js', 1 FROM projects p WHERE p.name = 'IoT Dashboard'
UNION ALL
SELECT p.id, 'D3.js', 2 FROM projects p WHERE p.name = 'IoT Dashboard'
UNION ALL
SELECT p.id, 'Python', 0 FROM projects p WHERE p.name = 'AI Chatbot'
UNION ALL
SELECT p.id, 'TensorFlow', 1 FROM projects p WHERE p.name = 'AI Chatbot'
UNION ALL
SELECT p.id, 'NLTK', 2 FROM projects p WHERE p.name = 'AI Chatbot'
UNION ALL
SELECT p.id, 'C#', 0 FROM projects p WHERE p.name = 'Game Prototype'
UNION ALL
SELECT p.id, 'Unity', 1 FROM projects p WHERE p.name = 'Game Prototype'
UNION ALL
SELECT p.id, 'Blender', 2 FROM projects p WHERE p.name = 'Game Prototype';
INSERT INTO about_sections (title, summary, full_description, image_url, slide_order, is_active, cta_text, cta_link, category, created_at, updated_at)
VALUES
    (
        'Who I Am',
        'Full-stack developer passionate about building scalable web applications. I love turning complex problems into elegant solutions.',
        'I''m a full-stack developer with 5 years of experience building modern web applications. My journey started with Java and Spring Boot, and I''ve expanded into frontend technologies like React and Svelte.

    I''m passionate about clean code, user experience, and continuous learning. When I''m not coding, you''ll find me contributing to open-source projects or mentoring junior developers.

    My approach combines technical excellence with a deep understanding of user needs, resulting in applications that are both powerful and intuitive.',
        'https://picsum.photos/seed/coding/800/600',
        1,
        TRUE,
        'Get to Know Me',
        '/about',
        'intro',
        CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP
    ),
    (
        'Professional Journey',
        '5+ years building enterprise applications. Currently working with Java, Spring Boot, and modern frontend frameworks.',
        'Senior Full-Stack Developer | TechCorp Inc. (2022-Present)
    • Led development of microservices architecture serving 1M+ users
    • Implemented CI/CD pipelines reducing deployment time by 60%
    • Mentored 5 junior developers

    Full-Stack Developer | StartupXYZ (2020-2022)
    • Built e-commerce platform from ground up
    • Integrated payment systems and third-party APIs
    • Reduced page load times by 40% through optimization

    Education:
    • B.S. Computer Science - University Name (2018)
    • AWS Certified Solutions Architect',
        'https://picsum.photos/seed/workspace/800/600',
        2,
        TRUE,
        'View Full Experience',
        '/about',
        'experience',
        CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP
    ),
    (
        'Latest Thoughts',
        'Exploring the future of web development and sharing insights from my journey. Check out my latest blog post on microservices architecture.',
        'Welcome to my blog where I share thoughts on software development, best practices, and lessons learned throughout my career.

    Latest Post: Building Scalable Microservices with Spring Boot
    In this post, I dive deep into designing microservices that can handle millions of requests while maintaining clean architecture and testability.

    Topics I cover:
    • Software Architecture
    • Best Practices
    • Career Growth in Tech
    • Lessons from Real Projects',
        'https://picsum.photos/seed/blog/800/600',
        3,
        TRUE,
        'Read My Blog',
        '/about',
        'blog',
        CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP
    );
-- 4 work items linked to the 2nd AboutSection ("Professional Journey")
INSERT INTO about_work_items (about_sections_id, position, title, company, start_date, end_date, blurb)
SELECT a.id, 0, 'Associate Software Engineer', 'Lowe''s', DATE '2023-08-01', NULL,
       'SCO-UI team. Java + Spring Boot backend integrations; React/TS frontend; CI/CD. Owned internal Employee Relief Fund rebuild.'
FROM about_sections a WHERE a.title = 'Professional Journey';

INSERT INTO about_work_items (about_sections_id, position, title, company, start_date, end_date, blurb)
SELECT a.id, 1, 'Full-Stack Developer (Contract)', 'Freelance', DATE '2022-03-01', DATE '2023-07-31',
       'Built small-business web apps: Spring Boot APIs, Postgres, React; Docker deployments; payments and auth.'
FROM about_sections a WHERE a.title = 'Professional Journey';

INSERT INTO about_work_items (about_sections_id, position, title, company, start_date, end_date, blurb)
SELECT a.id, 2, 'Combat Medic (68W)', 'U.S. Army', DATE '2018-06-01', DATE '2021-12-31',
       'Scout platoon medic; ODA deployment; high-pressure triage, logistics, and training.'
FROM about_sections a WHERE a.title = 'Professional Journey';

INSERT INTO about_work_items (about_sections_id, position, title, company, start_date, end_date, blurb)
SELECT a.id, 3, 'Student, Computer Engineering (A.S.)', 'Forsyth Tech', DATE '2025-08-20', NULL,
       'Embedded track: C, assembly, microcontrollers. Projects: IoT dashboard, home-lab automation.'
FROM about_sections a WHERE a.title = 'Professional Journey';
