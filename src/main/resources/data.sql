insert into users(username, password, enabled, role)  select 'admin@wp.pl', '$2a$10$nf7ROKLBIAuL5DT9xIM5wu8/kKST8i/xNt3moaCdA0epg45xyRbkm', 1, 'ADMIN'
from dual
where not exists (select 1 from users where username = 'admin@wp.pl');