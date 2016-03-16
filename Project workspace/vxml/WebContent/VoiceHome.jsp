<?xml version="1.0" encoding="UTF-8"?>
<vxml version="2.1">
<form>
<field name="selection" >
<prompt>Hi welcome to smart library
  <break time="small"/> 
  How would you like to search your book <break time="small"/>
  By <break time="small"/>author or by <break time="small"/>category
 </prompt>
<grammar root="selection">
<rule id="selection">
<one-of>
<item>author</item>
<item>category</item>
</one-of>
</rule>
</grammar>
</field>
<block>
<if cond='selection=="author"'>
<submit next="author.jsp"/>
<elseif cond='selection=="catergory"'/>
<submit next="category.jsp"/>
</if>
</block>
</form>
</vxml>