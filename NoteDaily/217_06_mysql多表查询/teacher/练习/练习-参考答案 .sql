-- 1.返回拥有员工的部门名、部门号。(dept,emp)	
select distinct d.deptno,d.dname from dept d,emp e where e.deptno=d.deptno;
-- 2.工资多于smith的员工信息。
select sal from emp where ename='smith';
select * from emp where sal>800

select * from emp where sal>(select sal from emp where ename='smith');
-- 3.返回员工和其所属领导的姓名。（自连接）
select e.ename,l.ename from emp e,emp l where e.mgr=l.empno;
-- 4.返回雇员的雇佣日期早于其领导雇佣日期的员工及其领导姓名。(在日期类型可以直接比较)
select e.ename,l.ename from emp e,emp l where e.mgr=l.empno and e.hiredate<l.hiredate;
-- 5.返回员工姓名及其所在的部门名称。

select e.ename,d.dname from emp e,dept d where e.deptno=d.deptno;
-- 6.返回从事clerk工作的员工姓名和所在部门名称
select e.ename,d.dname from emp e,dept d where e.deptno=d.deptno and e.job='clerk';
-- 7.返回部门号及其本部门的最低工资。
select deptno,min(sal) from emp group by deptno;

-- 8.返回销售部(sales)所有员工的姓名。
select deptno from dept where dname='sales';
select ename from emp where deptno=30

select ename from emp where deptno=(select deptno from dept where dname='sales')

-- 9.返回工资多于平均工资的员工。
select avg(sal) from emp;
select * from emp where sal >?

select * from emp where sal >(select avg(sal) from emp)

-- 10.返回与SCOTT从事相同工作的员工。
select job from emp where ename='SCOTT';
select * from emp where job=?

select * from emp where job=(select job from emp where ename='SCOTT') and ename <> 'SCOTT';

-- 11.返回与30部门员工工资相同的员工姓名与工资。
select sal from emp where deptno=30
select ename,sal from emp where sal in(??)

select ename,sal from emp where sal in(select sal from emp where deptno=30)

-- 12.返回工资高于30部门所有员工工资水平的员工信息。
select max(sal) from emp where deptno=30
select * from emp where sal >?

select * from emp where sal >(select max(sal) from emp where deptno=30)
select * from emp where sal >all(select sal from emp where deptno=30);


-- 13.返回部门号、部门名、部门所在位置及其每个部门的员工总数。
select deptno,count(*) from emp group by(deptno)

select d.*,tmp.total from dept d,(select deptno,count(*) total from emp group by(deptno)) tmp where d.deptno=tmp.deptno;

select d.*,tmp.total 
from dept d 
left join (select deptno,count(*) total 
		from emp group by(deptno)) tmp 
	on d.deptno=tmp.deptno;
-- 14.返回员工的姓名、所在部门名及其工资。
select e.ename,d.dname,e.sal from emp e,dept d where e.deptno=d.deptno;
select e.ename,d.dname,e.sal from emp e join dept d on e.deptno=d.deptno;

-- 15.返回员工的详细信息。(包括部门名)
select e.*,d.dname from emp e join dept d on e.deptno=d.deptno;

-- 16.返回员工工作及其从事此工作的最低工资。
select job,min(sal) from emp group by job

-- 17.返回不同部门经理的最低工资。
select deptno,min(sal) from emp where job='manager' group by deptno;

-- 18.计算出员工的年薪，并且以年薪排序。
select ename,sal*12+ifnull(comm,0) yearsal from emp order by yearsal;

-- 19.返回工资处于第四级别的员工的姓名。
select * from salgrade where grade=4;
select e.ename from emp e,(select * from salgrade where grade=4) tmp where e.sal between tmp.losal and tmp.hisal;

select e.ename from emp e,salgrade s where s.grade=4 and e.sal between s.losal and s.hisal  ;
-- 20.返回工资为二等级的职员名字、部门所在地、和二等级的最低工资和最高工资
select e.ename,d.loc,s.losal,s.hisal from emp e,salgrade s,dept d where s.grade=2 and  e.deptno=d.deptno and e.sal between s.losal and s.hisal  ;

select e.ename,d.loc,s.losal,s.hisal 
from emp e
join salgrade s 
	on s.grade=2 and e.sal between s.losal and s.hisal 
join dept d
	on e.deptno = d.deptno

-- 21.工资等级多于smith的员工信息。
select s.hisal from emp e,salgrade s where e.ename='smith' and e.sal between s.losal and s.hisal;
select * from emp where sal >?

select * from emp where sal >(select s.hisal from emp e,salgrade s where e.ename='smith' and e.sal between s.losal and s.hisal)