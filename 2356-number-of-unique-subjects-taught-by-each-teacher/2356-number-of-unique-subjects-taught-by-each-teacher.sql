-- select distinct teacher_id,count(subject_id) as cnt from Teacher group by dept_id having cnt>1;

select teacher_id,  count(distinct subject_id) as cnt from teacher group by  teacher_id;