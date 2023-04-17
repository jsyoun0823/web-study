##객체 얼리기 (freezing)

- 자바스크립트에서 제공하는 기능 
- 임의의 객체를 불변 객체로 만들어주는 기능 

- 원래는 객체에 property를 추가하거나, 값을 변경 및 삭제하는 것이 가능함
- Object.freeze() 에 전달한 객체는 불가능해진다. 단, strict 모드에서만 동작한다.

```
'use strict';

const keesun = {
'name' : 'Keesun',
'age' : 40
};

Object.freeze(keesun);

keesun.kids = ["서연"];
keesun.name = "whiteship";
```

---------------------------------------

###가변객체와 불변객체

- final이 아닌 property들은 언제든 바꿔질 수 있다. 
- 불변으로 만들기 위해서는 'final'로 설정하면 불변하다
- 그러나 List<> 와 같은 레퍼런스 자체는 add 하는 것이 가능하다. final List 일지라도 바뀔 수 있음.  