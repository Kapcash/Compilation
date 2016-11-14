.rdata
.align 2
$LC0:
       .ascii	"%d\000"
.text
# label fact
# beginfunc 
	.align	2
	.globl fact
	.ent fact
fact:
	 addiu	$sp,$sp,-36
	 sw	$31,16($29)
# var v
# var n
# ifz v goto L10
       lw  $8,36($29)
	beq  $8,0,L10
# var T_0
# T_0 = v - 1
       li   $9, 1
	sub $9, $8, $9
# var T_1
# T_1 = n [ T_0 ]
       sw  $9,24($29)
       li   $10,4
       mult   $9,$10
       mflo   $9
       lw  $10,40($29)
       add   $9,$9,$10
       lw  $9,0($9)
# var T_2
# T_2 = T_1 + 1
       li   $11, 1
	add $11, $9, $11
# return T_2
       move  $2,$11
	 lw	$31,16($29)
	 addiu	$sp,$sp,36
	 jr  $31
	 nop
# goto L11
       sw  $2,32($29)
       sw  $9,28($29)
	j  L11
# label L10
L10:
# return 3
       li   $2, 3
	 lw	$31,16($29)
	 addiu	$sp,$sp,36
	 jr  $31
	 nop
# label L11
L11:
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,36
	 jr  $31
	 nop
	.end fact
