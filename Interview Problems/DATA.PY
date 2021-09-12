import random


names = [
'Bowen',
'Becker',
'Martin',
'Fitzgerald',
'Krueger',
'Patel',
'Phelps',
'Allen',
'Jones',
'Johnson',
'Armstrong',
'Lauren',
'Cline',
'Smith',
'Wheeler',
'Soto',
'Brooks',
'Turner',
'Lawson',
'Jones',
'Mercer',
'Church',
'Garrison',
'Walker',
'Warren',
'Moore',
'Moore',
'Sanders',
'Shaw',
'Harris',
'Benson',
'Johnson',
'Anderson',
'Horn',
'Little',
'Bailey',
'Burgess',
'Huff',
'Rodriguez',
'Lindsey',
'Guerra',
'Grant',
'Burgess',
'Mccall',
'Forbes',
'Hill',
'Nichols',
'Lewis',
'Robinson',
'Lewis',
'Rivera',
'Edwards',
'White',
'King',
'Chavez',
'Zavala',
'Castaneda',
'Mathis',
'Miles',
'Smith',
'Martinez',
'Robbins',
'Carpenter',
'Wong',
'White',
'Williams',
'Mendez',
'Mullins',
'Anderson',
'Hancock',
'Moore',
'Lynch',
'Heath',
'Barajas',
'Sanders',
'Hart',
'Smith',
'Robinson',
'Jordan',
'Gardner',
'Adams',
'Williams',
'Morgan',
'Powers',
'Flores',
'Perry',
'Patrick',
'Myers',
'Perkins',
'Moon',
'Reed',
'Reese',
'Mejia',
'Donovan',
'Reed',
'Shannon',
'Christensen',
'Ramos',
'Vasquez',
'jennings'
]
sex = ['M', 'F']
dept = ['ACCOUNTING', 'RESEARCH', 'SALES', 'OPERATIONS']

string = 'insert into employee values ('
file = open('data.txt', 'w')
for i in range(0, 70):

    string = 'insert into employee values ('
    empid = random.randint(1000, 2000)
    department = random.choice(dept)
    name =names[i]
    gender = random.choice(sex)
    salary = random.randint(10000, 80000)

    
    string += str(empid) + " ,\'" + name + "\'," + " \'" + gender + "\',"  + str(salary) + "," + "\'" + department + "\');\n"
    file.write(string)
    print(string)
file.close(0)
