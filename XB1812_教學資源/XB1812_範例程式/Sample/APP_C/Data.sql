
/*==================
   ** SQLServer 版本
 =================== */

 use school; --使用school資料庫

/* 檔案建立  */
IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'BOOK')
   DROP TABLE BOOK
GO
CREATE TABLE BOOK
    (BRN NUMERIC(10) NOT NULL,
     NAME VARCHAR(100),
     AUTHOR VARCHAR(20),
     PRICE NUMERIC(10,2),
     PUBLISHER CHAR(3))
CREATE UNIQUE INDEX BOOK ON BOOK (BRN)
CREATE INDEX BK_TIT  ON BOOK(NAME)
CREATE INDEX BK_AU   ON BOOK(AUTHOR)

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'VENDOR')
   DROP TABLE VENDOR
GO
CREATE TABLE VENDOR
    (ID CHAR(3) NOT NULL,
     NAME VARCHAR(20),
     RANK DECIMAL(3),
     CITY VARCHAR(20));
CREATE UNIQUE INDEX VENDOR ON VENDOR(ID);
GO

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'ORDERS')
   DROP TABLE ORDERS
GO
CREATE TABLE ORDERS
    (ID CHAR(10) NOT NULL,
     VID CHAR(3) NOT NULL,
     BRN NUMERIC(10) NOT NULL,
     ORD_DATE smalldatetime,
     ESTIMATE int,  --預估日數
     SHIP_DATE smalldatetime,
     QUANTITY NUMERIC(3))
CREATE UNIQUE INDEX ORDERS ON ORDERS(ID,VID,BRN,ORD_DATE)

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'PUBLISHER')
   DROP TABLE PUBLISHER
GO
CREATE TABLE PUBLISHER
    (PID CHAR(3) NOT NULL,
     NAME VARCHAR(50),
     CITY VARCHAR(10),
     ADDR VARCHAR(50))
CREATE UNIQUE INDEX PUBLISHER ON PUBLISHER(PID)


IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'COPIES')
   DROP TABLE COPIES
GO
CREATE TABLE COPIES
  (ID CHAR(4) NOT NULL,
   ACCN VARCHAR(10) NOT NULL,
   LOAN_TYPE CHAR(2),
   LOANER VARCHAR(10),
   LOAN_DATE DATETIME,
   LOANCOUNT INT);
CREATE UNIQUE INDEX COPIES ON COPIES(ID,ACCN);
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('105','ML001','P001','11/1/2000' ,4)
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('105','TL002','P002','11/1/2000' ,8)
INSERT INTO COPIES (ID,ACCN,LOANCOUNT)                  VALUES ('101','TL003'                    ,1)
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('102','ML004',''    ,''          ,7)
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('102','SL005','P002','10/21/2000',21)
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('102','SL006','P003','11/15/2000',14)
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('102','TL007','P004','10/14/2000',8)
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('103','ML008','P002','11/11/2000',42)
INSERT INTO COPIES (ID,ACCN,LOANER,LOAN_DATE,LOANCOUNT) VALUES ('103','SL009','P007','10/5/2000' ,12)

/* 資料建立 */

INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (101,'三國演義','羅貫中',120,'P1')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (102,'水滸傳'  ,'施耐庵',270,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (103,'紅樓夢'  ,'曹雪芹',370,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (104,'西遊記'  ,'吳承恩',140,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (105,'水經注'  ,'儷道元',270,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (106,'道德經'  ,'老子'  ,390,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (107,'C語言:資料處理程式庫'                     ,'項治中'      ,270,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (108,'SQL程式設計實務:資料庫技術'               ,'台灣培生教育',350,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (109,'TURBO C應用專輯:資料結構與演算法'         ,'蔡明志 '     ,210,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (110,'dBASE III PLUS:資料庫管理系統入門與應用'  ,'楊世瑩 '     ,390,'P2')
INSERT INTO BOOK (BRN,NAME,AUTHOR,PRICE,PUBLISHER) VALUES (111,'台灣高山之旅:資料、知識、地圖、行程實錄'  ,'老子'        ,450,'P2')

GO

INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('ARI','白羊書局','10','台北市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('TAU','金牛書局','20','台中市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('TWI','雙子書局','30','台東市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('CAN','巨蟹書局','20','台東縣')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('LEO','獅子書局','10','台南市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('VIR','處女書局','20','高雄市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('LIB','天秤書局','30','台北市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('SCO','天蠍書局','40','屏東市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('ARC','射手書局','20','台中市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('GOA','山羊書局','10','台中市')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('CAR','水瓶書局','30','屏東縣')
INSERT INTO VENDOR (ID,NAME,RANK,CITY) VALUES ('PIS','雙魚書局','20','台中市')
GO

INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10006','CAN',106,'1/28/2013',80,'2/10/2013',10)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10002','CAN',102,'1/03/2013',80,'4/10/2013',20)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10001','CAN',101,'2/02/2013',80,'3/10/2013',30)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10003','CAN',102,'2/10/2013',80,'2/20/2013',20)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10004','CAN',104,'2/21/2013',80,'5/10/2013',40)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10005','CAN',105,'2/15/2013',80,'3/10/2013',20)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10007','ARC',101,'2/12/2013',80,'3/5/2013',10)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10008','ARC',102,'2/15/2013',80,'5/10/2013',30)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10009','CAR',102,'2/16/2013',80,'6/10/2013',40)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,ESTIMATE,SHIP_DATE,QUANTITY) VALUES ('P10010','LIB',102,'2/10/2013',80,'6/10/2013',20)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,SHIP_DATE,QUANTITY) VALUES ('P10011','LIB',104,'2/07/2008','4/10/2008',20)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,SHIP_DATE,QUANTITY) VALUES ('P10012','LIB',105,'2/24/2008','4/10/2008',30)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,SHIP_DATE,QUANTITY) VALUES ('P10013','LEO',102,'2/18/2008','5/10/2008',40)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,SHIP_DATE,QUANTITY) VALUES ('P10014','LEO',106,'2/19/2008','5/10/2008',10)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,SHIP_DATE,QUANTITY) VALUES ('P10015','LEO',106,'2/21/2008','5/10/2008',20)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,SHIP_DATE,QUANTITY) VALUES ('P10016','LIB',105,'2/25/2008','5/10/2008',20)
INSERT INTO ORDERS (ID,VID,BRN,ORD_DATE,SHIP_DATE,QUANTITY) VALUES ('P10017','CAN',105,'2/25/2008','5/10/2008',25)
GO

INSERT INTO PUBLISHER (PID,NAME,CITY,ADDR) VALUES ('P1','古文出版社','台北市','長安東路100號')
INSERT INTO PUBLISHER (PID,NAME,CITY,ADDR) VALUES ('P2','中庸出版社','台中市','中港路一段200號')
INSERT INTO PUBLISHER (PID,NAME,CITY,ADDR) VALUES ('P3','春秋出版社','台北市','南京東路一段300號')
INSERT INTO PUBLISHER (PID,NAME,CITY) VALUES ('P4','聊齋出版社','台中市')
INSERT INTO PUBLISHER (PID,NAME,CITY,ADDR) VALUES ('P5','易經出版社','高雄市','三多路500號')
INSERT INTO PUBLISHER (PID,NAME,CITY) VALUES ('P6','大唐出版社','高雄市')
GO


/*====練習資料(II)======*/

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'EMPLOYEE')
   DROP TABLE EMPLOYEE
GO

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'DEPT')
   DROP TABLE DEPT
GO
CREATE TABLE DEPT
    (ID INT NOT NULL primary key,
     DESCRIPTION VARCHAR(15),
     LOCATION VARCHAR(50));
CREATE UNIQUE INDEX DEPT ON DEPT(ID);
INSERT INTO DEPT VALUES ('10','管理部'    ,'一樓A區');
INSERT INTO DEPT VALUES ('20','軟體部'    ,'二樓');
INSERT INTO DEPT VALUES ('21','軟體部'  ,'二樓A區');
INSERT INTO DEPT VALUES ('22','軟體部'  ,'二樓B區');
INSERT INTO DEPT VALUES ('23','系統部'    ,'二樓C,D區');
INSERT INTO DEPT VALUES ('30','業務部'    ,'二樓A,B,C區');
INSERT INTO DEPT VALUES ('40','市場部'    ,'二樓D區');
INSERT INTO DEPT VALUES ('50','海外事業部','三樓A區');
INSERT INTO DEPT VALUES ('60','客戶服務部','三樓B,C區');
INSERT INTO DEPT VALUES ('70','生產事業部','一樓B,C,D區');
INSERT INTO DEPT VALUES ('80','會計部'    ,'三樓D區');

CREATE TABLE EMPLOYEE
    (EmpNo INT NOT NULL primary key,
     LastName VARCHAR(15),
     FirstName VARCHAR(20),
     DeptNo INT,
     PhoneExt INT,
     HireDate DATETIME,
     Salary DECIMAL(9,2),
     Comm DECIMAL(8,2),
     Foreign key (DeptNo) references Dept(Id));
CREATE UNIQUE INDEX EMPLOYEE ON EMPLOYEE(EmpNo);

INSERT INTO EMPLOYEE VALUES ('2'  ,'Nelson'      ,'Roberto'    ,20,250,'1988-12-28','40000',500);
INSERT INTO EMPLOYEE VALUES ('4'  ,'Young'       ,'Bruce'      ,10,233,'1988-12-28','55500',3000);
INSERT INTO EMPLOYEE VALUES ('5'  ,'Lambert'     ,'Kim'        ,20,22 ,'1989-02-06','25000',1500);
INSERT INTO EMPLOYEE VALUES ('8'  ,'Johnson'     ,'Leslie'     ,40,410,'2007-04-05','25050',null);
INSERT INTO EMPLOYEE VALUES ('9'  ,'Forest'      ,'Phil'       ,20,229,'2007-04-17','25050',1500);
INSERT INTO EMPLOYEE VALUES ('11' ,'Weston'      ,'K. J.'      ,30,34 ,'1998-01-17','33292',500);
INSERT INTO EMPLOYEE VALUES ('12' ,'Lee'         ,'Terri'      ,20,256,'1990-05-01','45332',1500);
INSERT INTO EMPLOYEE VALUES ('14' ,'Hall'        ,'Stewart'    ,22,227,'1997-06-04','34482',3000);
INSERT INTO EMPLOYEE VALUES ('15' ,'Young'       ,'Katherine'  ,20,231,'2000-06-14','24400',500);
INSERT INTO EMPLOYEE VALUES ('20' ,'Papadopoulos','Chris'      ,80,887,'2000-01-01','25050',0);
INSERT INTO EMPLOYEE VALUES ('24' ,'Fisher'      ,'Pete'       ,80,888,'2000-09-12','23040',1500);
INSERT INTO EMPLOYEE VALUES ('28' ,'Bennet'      ,'Ann'        ,50,5  ,'1998-02-01','34482',null);
INSERT INTO EMPLOYEE VALUES ('29' ,'De Souza'    ,'Roger'      ,20,288,'2001-02-18','25500',3000);
INSERT INTO EMPLOYEE VALUES ('34' ,'Baldwin'     ,'Janet'      ,21,2  ,'2001-03-21','23300',500);
INSERT INTO EMPLOYEE VALUES ('36' ,'Reeves'      ,'Roger'      ,60,6  ,'1996-04-25','33620',500);
INSERT INTO EMPLOYEE VALUES ('37' ,'Stansbury'   ,'Willie'     ,70,7  ,'2005-04-25','39224',null);
INSERT INTO EMPLOYEE VALUES ('44' ,'Phong'       ,'Leslie'     ,22,216,'2005-06-03','40350',3000);
INSERT INTO EMPLOYEE VALUES ('45' ,'Ramanathan'  ,'Ashok'      ,21,209,'1991-08-01','33292',4500);
INSERT INTO EMPLOYEE VALUES ('46' ,'Steadman'    ,'Walter'     ,21,210,'2008-01-01','19599',500);
INSERT INTO EMPLOYEE VALUES ('52' ,'Nordstrom'   ,'Carol'      ,40,420,'1991-10-02','4500' ,null);
INSERT INTO EMPLOYEE VALUES ('61' ,'Leung'       ,'Luke'       ,30,3  ,'1992-02-18','34500',3000);
INSERT INTO EMPLOYEE VALUES ('65' ,'O''Brien'    ,'Sue Anne'   ,80,877,'1992-03-23','31275',500);
INSERT INTO EMPLOYEE VALUES ('71' ,'Burbank'     ,'Jennifer M.',20,289,'1992-04-15','45332',null);
INSERT INTO EMPLOYEE VALUES ('72' ,'Sutherland'  ,'Claudia'    ,10,0  ,'1998-04-20','35699',3000);
INSERT INTO EMPLOYEE VALUES ('83' ,'Bishop'      ,'Dana'       ,23,290,'1992-06-01','45000',500);
INSERT INTO EMPLOYEE VALUES ('85' ,'MacDonald'   ,'Mary S.'    ,40,477,'1992-06-01','35699',1500);
INSERT INTO EMPLOYEE VALUES ('94' ,'Williams'    ,'Randy'      ,80,892,'1992-08-08','28900',1500);
INSERT INTO EMPLOYEE VALUES ('105','Bender'      ,'Oliver H.'  ,23,255,'1992-10-08','36799',1500);
INSERT INTO EMPLOYEE VALUES ('107','Cook'        ,'Kevin'      ,80,894,'2000-02-01','35500',null);
INSERT INTO EMPLOYEE VALUES ('109','Brown'       ,'Kelly'      ,21,202,'2007-02-04','27000',500);
INSERT INTO EMPLOYEE VALUES ('113','Page'        ,'Mary '      ,80,845,'1993-04-12','48000',4000);
INSERT INTO EMPLOYEE VALUES ('110','Ichida'      ,'Yuki'       ,22,22 ,'2007-02-04','25689',500);
INSERT INTO EMPLOYEE VALUES ('114','Parker'      ,'Bill'       ,23,247,'1993-06-01','35000',null);
INSERT INTO EMPLOYEE VALUES ('118','Yamamoto'    ,'Takashi'    ,23,23 ,'1993-07-01','32500',3000);
INSERT INTO EMPLOYEE VALUES ('121','Ferrari'     ,'Roberto'    ,10,1  ,'1993-07-12','40500',null);
INSERT INTO EMPLOYEE VALUES ('127','Yanowski'    ,'Michael'    ,10,492,'1993-08-09','44000',4500);
INSERT INTO EMPLOYEE VALUES ('134','Glon'        ,'Jacques'    ,10,null   ,'1993-08-23','24855',1500);
INSERT INTO EMPLOYEE VALUES ('136','Johnson'     ,'Scott'      ,23,265,'1993-09-13','30588',500);
INSERT INTO EMPLOYEE VALUES ('138','Green'       ,'T.J.'       ,22,218,'2003-11-01','36000',null);
INSERT INTO EMPLOYEE VALUES ('141','Osborne'     ,'Pierre'     ,20,null  ,'2004-01-03','35600',3000);
INSERT INTO EMPLOYEE VALUES ('144','Montgomery'  ,'John'       ,80,820,'2004-03-30','35699',1500);
INSERT INTO EMPLOYEE VALUES ('145','Guckenheimer','Mark'       ,22,221,'2004-05-02','32000',null);





--PRODUCT

--SALES


IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'BRANCH')
   DROP TABLE BRANCH
GO
CREATE TABLE BRANCH
    (ID VARCHAR(10) NOT NULL,
     NAME VARCHAR(20),
     LOCATION VARCHAR(20));

INSERT INTO BRANCH VALUES ('ML','文圖','理學院');
INSERT INTO BRANCH VALUES ('TL','理圖','理學院');
INSERT INTO BRANCH VALUES ('SL','社圖','理學院');

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'BIB')
   DROP TABLE BIB
GO
CREATE TABLE BIB
    (BRN INT NOT NULL,
     TITLE VARCHAR(50),
     AUTHOR VARCHAR(10),
     PUBLISHER VARCHAR(10),
     PRICE INT);
INSERT INTO BIB VALUES (101,'土地徵收之比較研究'       ,'涂義光','松崗',  350);
INSERT INTO BIB VALUES (102,'工程受益費之理論與實務'   ,'林祖郁','成文',  450);
INSERT INTO BIB VALUES (103,'C語言:資料庫處理程式庫 '  ,'項治中','旗標',  490);
INSERT INTO BIB VALUES (104,'DBASE資料庫管理'          ,'黃新王','松崗',  300);
INSERT INTO BIB VALUES (105,'Delphi 資料庫應用實務 '   ,'翁志宏','木喬',  420);
INSERT INTO BIB VALUES (106,'人口政策資料彙集'         ,'蔡財豐','成文',  250);

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'HOLDING')
   DROP TABLE HOLDING
GO
CREATE TABLE HOLDING
    (BRN INT NOT NULL,
     ACCN VARCHAR(10) NOT NULL,
     BRANCH VARCHAR(10) NOT NULL,
     COUNT INT);

INSERT INTO HOLDING VALUES ('101','1001','ML',0);
INSERT INTO HOLDING VALUES ('101','1002','SL',1);
INSERT INTO HOLDING VALUES ('101','1003','SL',8);
INSERT INTO HOLDING VALUES ('102','1004','ML',4);
INSERT INTO HOLDING VALUES ('102','1005','TL',12);
INSERT INTO HOLDING VALUES ('103','1006','ML',15);
INSERT INTO HOLDING VALUES ('103','1007','TL',5);
INSERT INTO HOLDING VALUES ('103','1008','TL',2);
INSERT INTO HOLDING VALUES ('103','1009','TL',10);
INSERT INTO HOLDING VALUES ('103','1010','SL',3);
INSERT INTO HOLDING VALUES ('104','1011','TL',0);
INSERT INTO HOLDING VALUES ('104','1012','SL',0);
INSERT INTO HOLDING VALUES ('105','1013','SL',2);
INSERT INTO HOLDING VALUES ('106','1014','SL',8);

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'PATRON')
   DROP TABLE PATRON
GO
CREATE TABLE PATRON
  (ID VARCHAR(10) NOT NULL,
   NAME VARCHAR(20),
   BIRTH DATETIME,
   TYPE CHAR(2),
   PIN VARCHAR(10),
   ADDR VARCHAR(100),
   LOANCOUNT INT);
INSERT INTO PATRON (ID,NAME,BIRTH,TYPE,PIN,ADDR,LOANCOUNT) VALUES ('P201','張三','03/06/1970','S','A122233344','台北市',10);
INSERT INTO PATRON (ID,NAME,BIRTH,TYPE,PIN,ADDR,LOANCOUNT) VALUES ('P202','李四','03/06/1975','T','D211133355','台南市',30);
INSERT INTO PATRON (ID,NAME,BIRTH,TYPE,PIN,ADDR,LOANCOUNT) VALUES ('P203','王五','03/06/1976','T','E123456789','高雄市',45);
INSERT INTO PATRON (ID,NAME,BIRTH,TYPE,PIN,ADDR,LOANCOUNT) VALUES ('P204','錢六','03/06/1973','E','E223344556','高雄市',23);
INSERT INTO PATRON (ID,NAME,BIRTH,TYPE,PIN,ADDR,LOANCOUNT) VALUES ('P205','趙七','03/06/1980','E','F135792468','新北市',25);
INSERT INTO PATRON (ID,NAME,BIRTH,TYPE,PIN,ADDR,LOANCOUNT) VALUES ('P206','陳八','03/06/1985','E','V222222222','台東縣',15);
INSERT INTO PATRON (ID,NAME,BIRTH,TYPE,PIN,ADDR,LOANCOUNT) VALUES ('P207','呂九','03/06/1960','F','C123454321','基隆市',33);


IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME ='CODE_TYPE')
   DROP TABLE CODE_TYPE
GO
CREATE TABLE CODE_TYPE
  (ID VARCHAR(10) NOT NULL,
   NAME VARCHAR(100));
INSERT INTO CODE_TYPE (ID,NAME) VALUES ('E','學生');
INSERT INTO CODE_TYPE (ID,NAME) VALUES ('T','老師');
INSERT INTO CODE_TYPE (ID,NAME) VALUES ('S','職員');
INSERT INTO CODE_TYPE (ID,NAME) VALUES ('F','校友');


IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'CODE_MEDIA')
   DROP TABLE CODE_MEDIA
GO
CREATE TABLE CODE_MEDIA
  (ID VARCHAR(10) NOT NULL,
   NAME VARCHAR(100));
INSERT INTO CODE_MEDIA (ID,NAME) VALUES ('A','圖書');
INSERT INTO CODE_MEDIA (ID,NAME) VALUES ('P','書畫');
INSERT INTO CODE_MEDIA (ID,NAME) VALUES ('C','音樂');
INSERT INTO CODE_MEDIA (ID,NAME) VALUES ('P','手稿');
INSERT INTO CODE_MEDIA (ID,NAME) VALUES ('D','地圖');

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'ONLOAN')
   DROP TABLE ONLOAN
GO
CREATE TABLE ONLOAN
    (ACCN VARCHAR(10) NOT NULL,
     PATRON VARCHAR(10),
     ISS_DATE DATETIME,
     DUE_DATE DATETIME);

INSERT INTO ONLOAN VALUES ('1002','P203','12-05-2001','02-05-2008');
INSERT INTO ONLOAN VALUES ('1005','P203','12-05-2001','02-05-2008');
INSERT INTO ONLOAN VALUES ('1006','P203','12-05-2001','02-05-2008');
INSERT INTO ONLOAN VALUES ('1014','P203','12-05-2001','02-05-2008');
INSERT INTO ONLOAN VALUES ('1001','P206','12-27-2001','01-27-2008');
INSERT INTO ONLOAN VALUES ('1010','P206','12-27-2001','01-27-2008');
INSERT INTO ONLOAN VALUES ('1008','P201','01-08-2008','02-08-2008');
INSERT INTO ONLOAN VALUES ('1012','P202','01-15-2008','03-15-2008');
INSERT INTO ONLOAN VALUES ('1003','P202','01-15-2008','03-15-2008');

--計算現正借書的人與各人借閱的數目 SELECT patron,count(*) FROM ONLOAN group by patron








--



IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'COURSE')
   DROP TABLE COURSE
GO

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'SUBJECT')
   DROP TABLE SUBJECT
GO

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'TEACHER')
   DROP TABLE TEACHER
GO


IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'STUDENT')
   DROP TABLE STUDENT
GO


/*============*/

CREATE TABLE STUDENT
    (ID CHAR(10) PRIMARY KEY NOT NULL,
     NAME VARCHAR(8),
     ADDRESS VARCHAR(30),
     BIRTH DATETIME,
     GENDER CHAR(1))
CREATE UNIQUE INDEX STUDENT ON STUDENT (ID)
GO


INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851001','張三'  ,'基隆市愛三路'          ,'01/12/1989','F')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851002','李四'  ,'台北市復興北路'       ,'10/24/1990','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851003','王五'  ,'台北縣新莊市中正路','04/15/1991','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851004','錢六'  ,'台北縣板橋市文化路','09/14/1990','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851005','趙七'  ,'台北縣板橋市中正路','03/02/1992','F')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851006','陳八'  ,'台北市忠孝東路'       ,'07/30/1991','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851007','吳九'  ,'基隆市中正路'           ,'10/24/1990','F')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851008','畢十  '  ,'苗栗市世界一路'       ,'04/09/1990','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851009','任閑齊','台北縣新莊市思源路'  ,'05/18/1990','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851010','吳奇農','桃園縣莊敬二路'       ,'02/19/1993','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851011','錢六'    ,'台北市木柵路'       ,'04/21/1992','F')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851012','背多分','台北市介壽路'       ,'07/10/1993','F')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851013','  許十一','台北縣板橋市縣民大道100號'   ,'09/17/1992','M')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851014','紀十二郎 ','新竹市仁愛路200號'   ,'1/1/1993','F')
INSERT INTO STUDENT (ID,NAME,ADDRESS,BIRTH,GENDER) VALUES ('5851015',' 楊十三 ','新竹市仁愛路200號'   ,'1/1/1993','F')

GO



CREATE TABLE TEACHER
    (ID CHAR(3) PRIMARY KEY NOT NULL,
     DESCRIPTION VARCHAR(20),
     TITLE VARCHAR(10),
     PASSWORD VARCHAR(10)
     )

INSERT INTO TEACHER VALUES ('T1','張老師','教授'        ,'90011')
INSERT INTO TEACHER VALUES ('T2','李老師','副教授'    ,'91053')
INSERT INTO TEACHER VALUES ('T3','陳老師','助理教授','92007')
INSERT INTO TEACHER VALUES ('T5','王老師','助理教授','92021')
INSERT INTO TEACHER VALUES ('T7','李老師','教授'       ,'93101')
GO

CREATE TABLE SUBJECT
    (ID CHAR(3) PRIMARY KEY NOT NULL,
     DESCRIPTION VARCHAR(20),
     TEACHER CHAR(3) not null,
     FOREIGN KEY (TEACHER) REFERENCES TEACHER(ID) on delete cascade on update cascade)

INSERT INTO SUBJECT (ID,DESCRIPTION,TEACHER) VALUES ('CT','數位媒體概論'  ,'T1')
INSERT INTO SUBJECT (ID,DESCRIPTION,TEACHER) VALUES ('RF','參考資源'      ,'T1')
INSERT INTO SUBJECT (ID,DESCRIPTION,TEACHER) VALUES ('DB','資料庫系統'    ,'T3')
INSERT INTO SUBJECT (ID,DESCRIPTION,TEACHER) VALUES ('LM','資訊行為'      ,'T5')
INSERT INTO SUBJECT (ID,DESCRIPTION,TEACHER) VALUES ('CO','程式設計概論'  ,'T7')
INSERT INTO SUBJECT (ID,DESCRIPTION,TEACHER) VALUES ('CG','資訊傳播學概論','T7')
GO

CREATE TABLE COURSE
    (ID CHAR(10) NOT NULL,
     SUBJECT CHAR(3) NOT NULL,
     SCORE NUMERIC(3),
     PRIMARY KEY (ID,SUBJECT),
     FOREIGN KEY (ID)      REFERENCES STUDENT (ID) ON DELETE CASCADE,
     FOREIGN KEY (SUBJECT) REFERENCES SUBJECT (ID))

INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851001','CT',80)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851002','CT',68)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851003','CT',95)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851004','CT',77)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851005','CT',77)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851006','CT',92)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851008','CT',85)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851009','CT',76)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851010','CT',81)

INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851001','RF',65)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851003','RF',71)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851005','RF',80)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851006','RF',68)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851007','RF',90)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851009','RF',95)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851010','RF',79)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851011','RF',70)

INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851002','DB',89)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851003','DB',94)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851004','DB',76)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851005','DB',65)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851006','DB',71)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851007','DB',83)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851008','DB',91)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851009','DB',75)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851011','DB',62)

INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851001','CO',66)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851002','CO',67)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851003','CO',77)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851004','CO',95)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851005','CO',87)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851006','CO',90)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851007','CO',83)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851009','CO',84)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851011','CO',73)

INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851002','CG',80)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851003','CG',75)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851004','CG',98)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851005','CG',67)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851006','CG',87)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851007','CG',75)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851009','CG',93)
INSERT INTO COURSE (ID,SUBJECT,SCORE) VALUES ('5851011','CG',66)





GO

/*
銷售買賣練習檔
*/

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'CUSTOMER')
   DROP TABLE CUSTOMER
GO
CREATE TABLE  CUSTOMER                                  --客戶貴賓主檔
   (ID CHAR(10) NOT NULL,                                --顧客編號  
    NAME VARCHAR(20),                                    --顧客姓名
    PASSWORD VARCHAR(20),
    BIRTH DATETIME,                                      --生日
    ZIP  CHAR(8) DEFAULT 100,                            --郵遞區號
    ADDR VARCHAR(50),                                    --地址
    TEL  VARCHAR(15),                                    --電話
    GENDER BIT);                                            --性別
CREATE UNIQUE INDEX CUSTOMER ON CUSTOMER(ID);

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME='PURCHASE')
   DROP TABLE PURCHASE
GO
CREATE TABLE PURCHASE                            --客戶購買歷史檔
    (CID CHAR(10)        NOT NULL,                       --客戶編號
    EID INT                    ,                      --銷售職員編號
    PDATE SMALLDATETIME      NOT NULL,                       --購買日期
    ARTICLE VARCHAR(10) NOT NULL,                       --商品貨物編號
    COUNT SMALLINT,                                     --數量
    PRICE DECIMAL(10,2));                               --單價(售價)
CREATE UNIQUE INDEX PURCHASE ON PURCHASE (CID,PDATE,ARTICLE);


IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'ARTICLE')
   DROP TABLE ARTICLE
GO
CREATE TABLE ARTICLE                                     --商品主檔';
    (ID CHAR(12) NOT NULL,                               --條碼號';
     NAME VARCHAR(40),                                   --商品名稱';
     INVENTORY INT DEFAULT 0,		       --商品庫存數量;
     COST DECIMAL(10,2),                                 --成本';
     PRICE DECIMAL(10,2));                               --售價';
CREATE UNIQUE INDEX ARTICLE ON ARTICLE(ID);

INSERT INTO CUSTOMER VALUES ('C01','張三','c011','03/12/1962','','台北市南京東路100號'       ,'23939889',1);
INSERT INTO CUSTOMER VALUES ('C02','李四','c022','12/23/1971','','台北市忠孝東路一段200號'   ,null,1);
INSERT INTO CUSTOMER VALUES ('C03','王五','c033','01/30/1975','','台北市復興南路二段300號'   ,'21688888',2);
INSERT INTO CUSTOMER VALUES ('C04','張三','c044','07/17/1968','','台北市吉林路一段100巷400號','25858168',2);
INSERT INTO CUSTOMER VALUES ('C05','趙七','c055','08/22/1965','','台北縣新莊市中正路510號'   ,null,1);
INSERT INTO CUSTOMER VALUES ('C06','陳八','c066','10/10/1973','','台北縣新莊市中正路100號'   ,'21234567',2);

INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C01', 5,'03/01/2007','A001',2,650);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C01',11,'03/01/2007','A004',5,100);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C03',15,'02/18/2007','A002',1,1100);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C03',15,'02/18/2007','A004',3,80);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C03',24,'02/18/2007','A005',5,15);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C04',36,'01/22/2007','A001',5,700);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C05',45,'03/21/2007','A005',2,15);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C05',52,'03/21/2007','A006',4,20);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C06',24,'02/27/2007','A003',12,25);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C01',24,'03/15/2007','A008',4,65);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C05',24,'03/16/2007','A008',1,65);
INSERT INTO PURCHASE (CID,EID,PDATE,ARTICLE,COUNT,PRICE) VALUES ('C05',15,'04/17/2007','A008',10,55);

INSERT INTO ARTICLE VALUES ('A001','花生糖',40     ,400,700);
INSERT INTO ARTICLE VALUES ('A002','A牌綜合維他命',100,250,1200);
INSERT INTO ARTICLE VALUES ('A003','花生糖漿',10  ,25 ,100);
INSERT INTO ARTICLE VALUES ('A004','花生粉圓',50    ,15 ,45);
INSERT INTO ARTICLE VALUES ('A005','工麥菊米酒',20      ,60 ,75);
INSERT INTO ARTICLE VALUES ('A006','思娘米酒',43      ,15 ,80);
INSERT INTO ARTICLE VALUES ('A007','花生米酒',8      ,70, 90);
INSERT INTO ARTICLE VALUES ('A008','三花生啤酒',15      ,50,70);
INSERT INTO ARTICLE VALUES ('A009','豆花生煎包',15      ,5,15);
INSERT INTO ARTICLE VALUES ('A010','工麥菊葡萄果糖',15      ,50,70);
INSERT INTO ARTICLE VALUES ('A011','工麥菊維他命C',15      ,50,70);
INSERT INTO ARTICLE VALUES ('A012','B牌綜合維他命',15      ,250,1000);
INSERT INTO ARTICLE VALUES ('A013','工麥菊啤酒',15      ,50,70);
INSERT INTO ARTICLE VALUES ('A014','粉圓便當',15      ,40,65);


--Staff, Unit, Depart表格用於AJAX連動選單之練習

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'STAFF')
   DROP TABLE STAFF
GO

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'Depart')
   DROP TABLE Depart
GO

IF EXISTS(SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES
      WHERE TABLE_NAME = 'Unit')
   DROP TABLE Unit
GO
CREATE TABLE Unit -- 單位總表
( id char(3) primary key,
  name varchar(20)
)
insert into Unit values ('adm','行政單位');
insert into Unit values ('col','教學單位');

CREATE TABLE Depart --單位所屬機構一覽表
(id char(3),
 dept char(4),
 name varchar(20),
 foreign key (id) references unit(id),
 primary key (dept)
)

insert into Depart values ('adm','cap','校長室');
insert into Depart values ('adm','edu','教務處');
insert into Depart values ('adm','saf','學務處');
insert into Depart values ('adm','gso','總務處');
insert into Depart values ('adm','rd','研究發展處');
insert into Depart values ('adm','pub','公共事務處');
insert into Depart values ('adm','lib','圖書館');
insert into Depart values ('adm','his','校史館');
insert into Depart values ('adm','hum','人事室');
insert into Depart values ('adm','sec','秘書室');
insert into Depart values ('adm','acc','會計室');
insert into Depart values ('adm','com','計算機中心');

insert into Depart values ('col','man','管理學院');
insert into Depart values ('col','cc','共同課程中心');
insert into Depart values ('col','hss','人文社會學院');
insert into Depart values ('col','trc','教學研究中心');
insert into Depart values ('col','lei','終身教育學院');
insert into Depart values ('col','ccu','文創學院');
insert into Depart values ('col','med','醫學院');

CREATE TABLE Staff
(id VARCHAR(10) PRIMARY KEY,
 password VARCHAR(20),
 name VARCHAR(15),
 mail VARCHAR(30),
 unit char(3),
 depart char(4),
 foreign key (unit) references Unit(id),
 foreign key (depart) references Depart(dept),
 );

INSERT INTO STAFF VALUES ('S01','abcdefg'  ,'張三','cheng@school.edu.tw','adm','edu');    
INSERT INTO STAFF VALUES ('S02','1234567','李四','lee@school.edu.tw','col','man');    






