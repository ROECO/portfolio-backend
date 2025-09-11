INSERT INTO projects (id, name, description, image_url, video_url)
VALUES
    (1, 'Portfolio Backend', 'Spring Boot + PostgreSQL backend for my portfolio site.', 'https://picsum.photos/seed/backend/400/300', NULL),
    (2, 'Portfolio Frontend', 'React + TypeScript frontend for the portfolio.', 'https://picsum.photos/seed/frontend/400/300', 'https://www.youtube.com/watch?v=dummy1'),
    (3, 'IoT Dashboard', 'Monitor IoT devices and sensors in real time.', 'https://picsum.photos/seed/iot/400/300', 'https://www.youtube.com/watch?v=dummy2'),
    (4, 'AI Chatbot', 'Simple chatbot using Python and NLP libraries.', 'https://picsum.photos/seed/chatbot/400/300', NULL),
    (5, 'Game Prototype', 'Small 2D game demo built with Unity.', 'https://picsum.photos/seed/game/400/300', 'https://www.youtube.com/watch?v=dummy3');

INSERT INTO tools_languages (project_id, tool_language, position)
VALUES
    (1, 'Java', 0),
    (1, 'Spring Boot', 1),
    (1, 'PostgreSQL', 2),

    (2, 'TypeScript', 0),
    (2, 'React', 1),
    (2, 'TailwindCSS', 2),

    (3, 'JavaScript', 0),
    (3, 'Node.js', 1),
    (3, 'D3.js', 2),

    (4, 'Python', 0),
    (4, 'TensorFlow', 1),
    (4, 'NLTK', 2),

    (5, 'C#', 0),
    (5, 'Unity', 1),
    (5, 'Blender', 2);
