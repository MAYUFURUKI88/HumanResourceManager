-- 履歴
/*
2021.02.03 
    テーブル設計(users)
    テーブル設計(group_code)
    テーブル設計(code)
2021.02.03 
	テーブル設計(demo)
	データ追加(demo)
2021.02.04
	データ追加(group_code, code)
	テーブル設計(applicants)
**/

-- 参考
/*
CREATE DATABASE rapide_hrm DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
grant all privileges on rapide_hrm.* to 'rapide'@'%' identified by '0000' with grant option;
flush privileges;
use rapide_hrm;
*/

-- 本文
-- sample data for datatables
CREATE TABLE IF NOT EXISTS demo (
    id int primary key auto_increment comment '番号(PK)',
    name varchar(100) not null unique comment '名前',
    gender varchar(1) not null comment '性別(FK)',
    delete_yn varchar(1) default 'N' comment '削除フラグ(Y/N)',
    create_date datetime default now() comment '生成日時',
    update_date datetime comment '修正日時',
    delete_date datetime comment '削除日時'
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

insert into demo (name, gender) values('三重野 千枝', 'F');
insert into demo (name, gender) values('金 蘭', 'F');
insert into demo (name, gender) values('谷下 祐介', 'M');
insert into demo (name, gender) values('衛藤 一真', 'M');
insert into demo (name, gender) values('清水 詩織', 'M');
insert into demo (name, gender) values('長原 佑真', 'M');
insert into demo (name, gender) values('門田 里紗子', 'F');
insert into demo (name, gender) values('篠原 芳樹', 'M');
insert into demo (name, gender) values('野口 栄太', 'M');
insert into demo (name, gender) values('中野 晃平', 'M');
insert into demo (name, gender) values('徳田 新也', 'M');
insert into demo (name, gender) values('井手 一成', 'M');
insert into demo (name, gender) values('川畑 政貴', 'M');
insert into demo (name, gender) values('田中 宏並', 'M');

-- spring security 導入予定なので修正が必要です。
CREATE TABLE IF NOT EXISTS users (
    id int primary key auto_increment comment '番号(PK)',
    account varchar(100) not null unique comment 'アカウント',
    password varchar(100) not null comment 'パスワード',
    username varchar(100) not null comment 'ユーザー名',
    level varchar(10) comment '権限(FK)',
    delete_yn varchar(1) default 'N' comment '削除フラグ(Y/N)',
    create_date datetime default now() comment '生成日時',
    update_date datetime comment '修正日時',
    delete_date datetime comment '削除日時',
    login_date datetime comment 'ログイン日時'
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS group_code (
    group_code varchar(10) primary key comment 'グループコード(PK)',
    name varchar(255) not null comment '名称',
    delete_yn varchar(1) default 'N' comment '削除フラグ(Y/N)',
    create_date datetime default now() comment '生成日時',
    update_date datetime comment '修正日時',
    delete_date datetime comment '削除日時',
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS code (
    group_code varchar(10) comment 'グループコード(PK, FK)',
    code varchar(10) comment 'コード(PK)',
    name varchar(255) not null comment '名称',
    delete_yn varchar(1) default 'N' comment '削除フラグ(Y/N)',
    create_date datetime default now() comment '生成日時',
    update_date datetime comment '修正日時',
    delete_date datetime comment '削除日時',
    primary key (group_code, code)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

insert into group_code (group_code, name) values('001', '性別');
insert into code (group_code, code, name) values('001', 'M', '男');
insert into code (group_code, code, name) values('001', 'F', '女');

CREATE TABLE IF NOT EXISTS applicants (
	id int primary key auto_increment comment '番号(PK)',
    family_name varchar(100) not null comment '姓',
    name varchar(100) not null comment '名',
    family_name_kana varchar(100) not null comment '姓(かな)',
    name_kana varchar(100) not null comment '名(かな)',
    phone varchar(100) comment '電話番号',
    email varchar(100) comment 'メール',
    birth varchar(10) comment '年齢',
    gender varchar(10) comment '性別(FK)',
    address varchar(100) comment '住所',
    exp_yn varchar(100) comment '実務経験(Y/N)',
    status varchar(100) comment '選考状況(FK)',
    media_type varchar(100) comment '応募媒体(FK)',
    apply_type varchar(100) comment '希望職種(FK)',
    reason text comment '希望職種に関する経歴',
    addition_input text comment '備考',
    user_id int not null comment '番号(FK)',
    delete_yn varchar(1) default 'N' comment '削除フラグ(Y/N)',
    create_date datetime default now() comment '生成日時',
    update_date datetime comment '修正日時',
    delete_date datetime comment '削除日時'
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;