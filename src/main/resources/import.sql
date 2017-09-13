-- delete employee;

insert into employee (id, first_Name, last_Name, phone_number, email, trade, resume_link) values (1, 'Bob', 'Boberson', '555-555-1011', 'Bob@company.com', 'Carpenter', 'placeholder');
insert into employee (id, first_Name, last_Name, phone_number, email, trade) values (2, 'Allen', 'Allerson', '555-555-1321', 'allen@company.com', 'Electrician');
insert into employee (id, first_Name, last_Name, phone_number, email, trade, resume_link) values (3, 'Megan', 'Megerson','555-555-1004', 'megan@company.com', 'Carpenter', 'placeholder');
insert into employee (id, first_Name, last_Name, phone_number, email, trade, resume_link) values (4, 'Max', 'Maxiest', '555-555-7041', 'max@company.com', 'Welder', 'placeholder');
insert into employee (id, first_Name, last_Name, phone_number, email, trade) values (5, 'Cecil', 'LilTerror', '555-555-6582', 'cecil@company.com' , 'Electrician');
insert into employee (id, first_Name, last_Name, phone_number, email, trade, resume_link) values (6, 'Jacob', 'Jackobson', '555-555-6853', 'jacob@company.com', 'Carpenter', 'placeholder');

insert into user_Account (id, username, name, user_Role) values (1, 'bboberson', 'Bob Boberson', 'Employee');
insert into user_Account (id, username, name, user_Role) values (2, 'aallerson', 'Allen Allerson', 'Admin');
insert into user_Account (id, username, name, user_Role) values (3, 'jjackobson', 'Jacob Jaackobson', 'Employee');