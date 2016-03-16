<?xml version="1.0" encoding="UTF-8"?>
<vxml version="2.1">
<form>
	<% String accnum = (String)session.getAttribute("accnum");
	System.out.println("in main menu jsp...");
	session.setAttribute("accnum", accnum);
	%> 
<field name="selection">
<prompt> you have logged in successfully. Please choose a category from the following
          <break time="small"/>Academic Books
          <break time="small"/>Novels
          <break time="small"/>Self help Books
           <break time="small"/>Sports
           <break time="small"/>Science
           <break time="small"/>Magazines
           <break time="small"/>Arts
                    
          </prompt>
              <grammar root="s"><%--Declaring the valid expected grammar from user --%>
                 <rule id="s">
					<one-of>
						<item>Academic Books </item>
						<item>Novels </item>
						<item>Self help Books </item>
						<item>Sports </item>
						<item>Science </item>
						<item>Magazines </item>
						<item>Arts </item>
					</one-of>
		         </rule>
	           </grammar>
</field>
<block>
		<var name="acno" expr="'<%=accnum %>'" />
        <if cond="selection=='Academic Books'">    
         	
         	<prompt> you have choosed Academic Books. Please choose a sub category from the following
          <break time="small"/>Engineering
          <break time="small"/>Medicine
          <break time="small"/>Law
          <break time="small"/>Business
                         
          
          </prompt>
        <grammar root="s">  <%--Declaring the valid expected grammar from user --%>
                 <rule id="s">
					<one-of>
						<item>Engineering </item>
						<item>Medicine </item>
						<item>Law </item>
						<item>Business </item>
						
					</one-of>  
		         </rule>
	           </grammar>
	           
        
         
         <elseif cond="selection=='Novels'" />
            
         <prompt> you have choosed Novels. Please choose a sub category from the following
          <break time="small"/>Biography
          <break time="small"/>Fiction
          <break time="small"/>Non Fiction
          <break time="small"/>Thriller
                         
          </prompt>
        	<grammar root="s">  <%--Declaring the valid expected grammar from user --%>
                 <rule id="s">
					<one-of>
						<item>Biography </item>
						<item>Fiction </item>
						<item>Non Fiction </item>
						<item>Thriller </item>
						
					</one-of>
		         </rule>
	           </grammar>
	           
         <elseif cond="selection=='Self help Books'" />
             <submit next="ConfirmationBeforeTransaction.jsp" />         
         
         <elseif cond="selection=='Sports'"/>
             <submit next="FundTransfer?action=statementservlet"/>         
         
         <elseif cond="selection=='Science'"/>
             <submit next="FundTransfer?action=statementservlet"/>  
         
         <elseif cond="selection=='Magazines'"/>
             <submit next="FundTransfer?action=statementservlet"/>
             
         <elseif cond="selection=='Arts'"/>
             <submit next="FundTransfer?action=statementservlet"/>      
     </if>
     </block>
</form>
</vxml>
