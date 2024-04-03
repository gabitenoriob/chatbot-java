CREATE TABLE IF NOT EXISTS champions (
                                                   id INT AUTO_INCREMENT PRIMARY KEY,
                                                   name VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL,
    lore TEXT,
    image_url VARCHAR(255)
    );

INSERT INTO champions (name, role, lore, image_url) VALUES
                                                                       ('Ada Lovelace', 'Programadora', 'Considerada a primeira programadora de computadores, colaborou com Charles Babbage no projeto da Máquina Analítica.', 'https://upload.wikimedia.org/wikipedia/commons/a/a4/Ada_Lovelace_portrait.jpg'),
                                                                       ('Grace Hopper', 'Programadora', 'Desenvolveu o primeiro compilador para uma linguagem de programação e popularizou o termo "debugging".', 'https://upload.wikimedia.org/wikipedia/commons/2/21/Grace_Hopper.jpg'),
                                                                       ('Margaret Hamilton', 'Cientista da Computação', 'Desenvolveu o software de voo usado no Projeto Apollo da NASA, sendo fundamental para a chegada do homem à Lua.', 'https://upload.wikimedia.org/wikipedia/commons/9/9b/Margaret_Hamilton_1995.jpg'),
                                                                       ('Hedy Lamarr', 'Inventora', 'Co-inventora da tecnologia de espalhamento espectral, precursora da comunicação sem fio moderna.', 'https://upload.wikimedia.org/wikipedia/commons/0/00/Hedy_Lamarr_-_Publicity_-_H_27.77_-_1983_-_Cropped.jpg'),
                                                                       ('Jean Bartik', 'Programadora', 'Uma das seis mulheres programadoras do ENIAC, um dos primeiros computadores eletrônicos.', 'https://upload.wikimedia.org/wikipedia/commons/e/e9/Jean_Bartik_and_FR0M_the_1ST_rotating_disk_memory.jpg'),
                                                                       ('Adele Goldberg', 'Cientista da Computação', 'Co-desenvolvedora da linguagem de programação Smalltalk e pioneira na computação orientada a objetos.', 'https://upload.wikimedia.org/wikipedia/commons/5/5f/Adele_Goldberg_at_CHM.jpg'),
                                                                       ('Radia Perlman', 'Engenheira de Redes', 'Inventora do protocolo de rede STP (Spanning Tree Protocol) e autora de vários livros sobre redes de computadores.', 'https://upload.wikimedia.org/wikipedia/commons/5/51/Radia_Perlman_2013.jpg'),
                                                                       ('Barbara Liskov', 'Cientista da Computação', 'Criadora do princípio de substituição de Liskov e desenvolvedora do paradigma de programação orientada a objetos.', 'https://upload.wikimedia.org/wikipedia/commons/2/29/Barbara_Liskov_%28cropped%29.jpg'),
                                                                       ('Shafi Goldwasser', 'Cientista da Computação', 'Notável por seu trabalho em criptografia, sendo co-criadora do algoritmo RSA e ganhadora do Prêmio Turing.', 'https://upload.wikimedia.org/wikipedia/commons/7/73/Shafi_Goldwasser_-_OFFICIAL_PHOTO_-_AMERICAN_-_COMPUTER_SCIENTIST.jpg'),
                                                                       ('Frances E. Allen', 'Cientista da Computação', 'Primeira mulher a receber o Prêmio Turing, por seu trabalho pioneiro em otimização de compiladores.', 'https://upload.wikimedia.org/wikipedia/commons/5/5c/Frances_E_Allen.jpg'),
                                                                       ('Annie Easley', 'Engenheira de Software', 'Matemática e cientista da computação que trabalhou na NASA, contribuindo para o desenvolvimento de software para o Centaur rocket e a iniciativa de energia alternativa.', 'https://upload.wikimedia.org/wikipedia/commons/3/3b/Annie_J._Easley_-_GPN-2000-001952.jpg'),
                                                                       ('Radia Perlman', 'Engenheira de Redes', 'Inventora do protocolo de rede STP (Spanning Tree Protocol) e autora de vários livros sobre redes de computadores.', 'https://upload.wikimedia.org/wikipedia/commons/5/51/Radia_Perlman_2013.jpg');
